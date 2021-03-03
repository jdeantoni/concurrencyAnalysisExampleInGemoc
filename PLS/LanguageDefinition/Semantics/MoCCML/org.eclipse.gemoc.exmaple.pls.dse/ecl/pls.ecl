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
		def : allInputConveyors : Collection(Conveyor) = self.oclAsType(ecore::EObject).eContainer().oclAsType(ProductionLineModel).elements->select(eo |eo.oclIsKindOf(Conveyor) and eo.oclAsType(Conveyor).tray = self).oclAsType(Conveyor)
		def : theOutputMachine : Machine = --self.Machine->asSequence()->first() 
		self.oclAsType(ecore::EObject).eContainer().oclAsType(ProductionLineModel).elements->select(eo |eo.oclIsKindOf(Machine) and eo.oclAsType(Machine)._in= self)->asSequence()->first().oclAsType(Machine)
		inv produceWaitForInputNoInitial:
	 		(self.parts->size() = 0) implies
	 		let lastInputArrival : Event = Expression Sup(allInputConveyors.doMoveAlong) in
	 		Relation Precedes(lastInputArrival, theOutputMachine.doWork)

	context Conveyor
		def : theInputMachine : Machine = self.oclAsType(ecore::EObject).eContainer().oclAsType(ProductionLineModel).elements->select(eo |eo.oclIsKindOf(Machine) and eo.oclAsType(Machine)._out = self)->asSequence()->first().oclAsType(Machine)
		inv moveAfterMachineProductionNoInitial:
			(self.parts->size() = 0) implies
			(Relation Precedes(theInputMachine.doWork, self.doMoveAlong))

		inv moveAfterMachineProductionInitial:
			(self.parts->size() > 0) implies
			let delay : Integer = self.parts->size().round() in 
			let delayedMoveAlong : Event = Expression DelayFor(self.doMoveAlong, self.doMoveAlong, delay) in
			Relation Precedes(theInputMachine.doWork, delayedMoveAlong)		
 
--	context Machine
--	 	def : allInputConveyors : Collection(Conveyor) = self.oclAsType(ecore::EObject).eContainer().eAllContents()->select(eo |eo.oclIsKindOf(Conveyor) and eo.oclAsType(Conveyor).tray = self._in).oclAsType(Conveyor)
--	 	inv produceWaitForInputNoInitial:
--	 		(self._in <> null and self._in->size() > 0 and self._in.parts->size() = 0) implies
--	 		let lastInputProduction : Event = Expression Inf(allInputConveyors.moveAlong) in
--	 		Relation Precedes(lastInputProduction, self.work)
--
--		inv produceWaitForInputInitial:
--	 		(self._in <> null and self._in->size() > 0 and self._in.parts->size() > 0) implies
--	 		let 
--	 		let lastInputProduction : Event = Expression Inf(allInputConveyors.moveAlong) in
--	 		Relation Precedes(lastInputProduction, self.work)

 endpackage