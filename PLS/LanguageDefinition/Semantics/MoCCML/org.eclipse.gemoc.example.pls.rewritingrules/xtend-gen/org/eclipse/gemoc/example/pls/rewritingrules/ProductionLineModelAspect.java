package org.eclipse.gemoc.example.pls.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect;
import org.eclipse.gemoc.example.pls.rewritingrules.ProductionLineModelAspectProductionLineModelAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import uk.ac.kcl.inf.modelling.pls.pls.Container;
import uk.ac.kcl.inf.modelling.pls.pls.Part;
import uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel;
import uk.ac.kcl.inf.modelling.pls.pls.impl.ContainerImpl;

@Aspect(className = ProductionLineModel.class)
@SuppressWarnings("all")
public class ProductionLineModelAspect {
  @Step
  @ReplaceAspectMethod
  @InitializeModel
  public static void initialize(final ProductionLineModel _self, final String[] unused) {
    final org.eclipse.gemoc.example.pls.rewritingrules.ProductionLineModelAspectProductionLineModelAspectProperties _self_ = org.eclipse.gemoc.example.pls.rewritingrules.ProductionLineModelAspectProductionLineModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initialize(String[])
    if (_self instanceof uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.eclipse.gemoc.example.pls.rewritingrules.ProductionLineModelAspect._privk3_initialize(_self_, (uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel)_self,unused);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {unused}, command, "ProductionLineModel", "initialize");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_initialize(final ProductionLineModelAspectProductionLineModelAspectProperties _self_, final ProductionLineModel _self, final String[] unused) {
    InputOutput.<String>println("initialization in progress ");
    EList<Container> _containers = _self.getContainers();
    for (final Container c : _containers) {
      {
        EObjectContainmentEList<Part> _eObjectContainmentEList = new EObjectContainmentEList<Part>(Part.class, ((ContainerImpl) c), 88);
        ContainerAspect.currentParts(c, _eObjectContainmentEList);
        EList<Part> _parts = c.getParts();
        ArrayList<Part> _arrayList = new ArrayList<Part>(_parts);
        for (final Part p : _arrayList) {
          ContainerAspect.currentParts(c).add(p);
        }
      }
    }
    InputOutput.<String>println("initialization done");
    return;
  }
}
