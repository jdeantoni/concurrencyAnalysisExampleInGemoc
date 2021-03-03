package org.eclipse.gemoc.example.pls.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import uk.ac.kcl.inf.modelling.pls.pls.Conveyor
import fr.inria.diverse.k3.al.annotationprocessor.Step
import uk.ac.kcl.inf.modelling.pls.pls.PLSFactory
import uk.ac.kcl.inf.modelling.pls.pls.GenHandle
import uk.ac.kcl.inf.modelling.pls.pls.GenHead
import uk.ac.kcl.inf.modelling.pls.pls.Assembler
import uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel
import uk.ac.kcl.inf.modelling.pls.pls.Handle
import uk.ac.kcl.inf.modelling.pls.pls.Head
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import uk.ac.kcl.inf.modelling.pls.pls.Container
import uk.ac.kcl.inf.modelling.pls.pls.Part
import java.util.ArrayList

import static extension org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel

@Aspect(className=Container)
class ContainerAspect{
	public ArrayList<Part> currentParts
}

@Aspect(className=Conveyor)
class ConveyorAspect {	
	@Step
	@ReplaceAspectMethod
	def void moveAlong(){		
		if (_self.tray !== null){
			_self.tray.currentParts.add(_self.currentParts.get(0));
		}else{
			(_self.eContainer as ProductionLineModel).elements.remove(_self.currentParts.get(0))
		}
		_self.currentParts.remove(0)
	}
}

@Aspect(className=ProductionLineModel)
class ProductionLineModelAspect {
	@Step
	@ReplaceAspectMethod
	@InitializeModel
	def void initialize(String[] unused){
		println("initialization in progress ")
		for(Container c : _self.elements.filter[e | e instanceof Container].map[e | e as Container]){
			c.currentParts = new ArrayList(c.parts)
			c.parts.clear
		}
		println("initialization done")
		 return
	}
}


@Aspect(className=Assembler)
class AssemblerAspect {
	@Step
	@ReplaceAspectMethod
	def void work(){
		var anHandle = _self.in.currentParts.filter[e|e instanceof Handle].get(0)
		var aHead = _self.in.currentParts.filter[e|e instanceof Head].get(0)
		
		_self.in.currentParts.remove(anHandle)
		_self.in.currentParts.remove(aHead)
		(_self.eContainer as ProductionLineModel).elements.remove(anHandle)
		(_self.eContainer as ProductionLineModel).elements.remove(aHead)
		
		var aHammer = PLSFactory.eINSTANCE.createHammer
		_self.out.currentParts.add(aHammer)
		(_self.eContainer as ProductionLineModel).elements.add(aHammer)
		 return
	}
}

@Aspect(className=GenHead)
class GenHeadAspect{
	
	@Step
	@ReplaceAspectMethod
	def void work(){
		var aHead = PLSFactory.eINSTANCE.createHead()
		(_self.eContainer as ProductionLineModel).elements.add(aHead)
		_self.out.currentParts.add(aHead) 
		return
	} 
}

@Aspect(className=GenHandle)
class GenHandleAspect{
	
	@Step
	@ReplaceAspectMethod
	def void work(){
		var aHandle = PLSFactory.eINSTANCE.createHandle()
		(_self.eContainer as ProductionLineModel).elements.add(aHandle)
		_self.out.currentParts.add(aHandle)
		 return
	}
}