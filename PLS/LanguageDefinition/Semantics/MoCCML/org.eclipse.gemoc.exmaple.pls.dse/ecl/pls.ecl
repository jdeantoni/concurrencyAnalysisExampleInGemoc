import 'platform:/resource/uk.ac.kcl.inf.modelling.pls.model/model/model.ecore'
import _'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package pls
	context Machine
		def : doWork : Event = self.work()

	context Conveyor
		def : doMoveAlong : Event = self.moveAlong()

	context Tray
		def : allInputConveyors : Collection(Conveyor) = self.oclAsType(ecore::EObject).eContainer().oclAsType(ProductionLineModel).containers->select(eo |eo.oclIsKindOf(Conveyor) and eo.oclAsType(Conveyor).tray = self).oclAsType(Conveyor)
		def : theOutputMachine : Machine = self.oclAsType(ecore::EObject).eContainer().oclAsType(ProductionLineModel).machines->select(eo |eo._in= self)->asSequence()->first()
		inv produceWaitForInputNoInitial:
	 		(self.parts->size() = 0) implies
	 		let lastInputArrival : Event = Expression Sup(allInputConveyors.doMoveAlong) in
	 		Relation Precedes(lastInputArrival, theOutputMachine.doWork)

	context Conveyor
		def : theInputMachine : Machine = self.oclAsType(ecore::EObject).eContainer().oclAsType(ProductionLineModel).machines->select(eo |eo._out = self)->asSequence()->first()
		inv moveAfterMachineProductionNoInitial:
			(self.parts->size() = 0) implies
			(Relation Precedes(theInputMachine.doWork, self.doMoveAlong))

		inv moveAfterMachineProductionInitial:
			(self.parts->size() > 0) implies
			let delay : Integer = self.parts->size().round() in 
			let delayedMoveAlong : Event = Expression DelayFor(self.doMoveAlong, self.doMoveAlong, delay) in
			Relation Precedes(theInputMachine.doWork, delayedMoveAlong)		
 
 endpackage