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

import static extension org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.util.EObjectContainmentEList
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.inf.modelling.pls.pls.impl.ContainerImpl
import java.util.ArrayList

//class EListMock extends BasicEList<Part>{
//	var EList<Part> original
//	new(EList<Part> l) {
//		super(l)
//		original = l
//	}
//	
//	new() {
//		super()
//	}
//	
//	override add(Part object) {
//		super.add(object)
//		original.add(object);
//	}
//	
//	override remove(int i) {
//		super.remove(i)
//		original.remove(i);
//	}
//	
//	override boolean remove(Object object) {
//		super.remove(object)
//		original.remove(object);
//	}
//	
//	
//	
//	override get(int index) {
//		original.get(index)
//	}
//	
//}


@Aspect(className=Container)
class ContainerAspect{
	//should use @Composition but collection are not supported, yet :-(
	public EObjectContainmentEList<Part> currentParts  //Runtime state of the model
	
}


@Aspect(className=ProductionLineModel)
class ProductionLineModelAspect {
	@Step
	@ReplaceAspectMethod
	@InitializeModel
	def void initialize(String[] unused){
		println("initialization in progress ")
		for(Container c : _self.containers){
			c.currentParts = new EObjectContainmentEList<Part>(Part, c as ContainerImpl,88) //random feature id
			for (Part p : new ArrayList(c.parts)){
				c.currentParts.add(p)
			}
		}
		println("initialization done")
		 return
	}
}

@Aspect(className=Conveyor)
class ConveyorAspect {	
	@Step
	@ReplaceAspectMethod
	def void moveAlong(){
		if (_self.tray !== null){ //there is a tray to receive the part
			_self.tray.currentParts.add(_self.currentParts.remove(0));
		}else{
			_self.currentParts.remove(0)
		}
	}
}

@Aspect(className=GenHead)
class GenHeadAspect{
	
	@Step
	@ReplaceAspectMethod
	def void work(){
		var aHead = PLSFactory.eINSTANCE.createHead()
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
		_self.out.currentParts.add(aHandle)
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
		
		var aHammer = PLSFactory.eINSTANCE.createHammer
		_self.out.currentParts.add(aHammer)
		 return
	}
}

