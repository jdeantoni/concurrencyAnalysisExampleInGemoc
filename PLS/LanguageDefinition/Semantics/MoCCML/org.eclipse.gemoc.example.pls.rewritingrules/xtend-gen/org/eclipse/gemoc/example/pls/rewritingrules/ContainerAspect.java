package org.eclipse.gemoc.example.pls.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectProperties;
import uk.ac.kcl.inf.modelling.pls.pls.Container;
import uk.ac.kcl.inf.modelling.pls.pls.Part;

@Aspect(className = Container.class)
@SuppressWarnings("all")
public class ContainerAspect {
  public static BasicEList<Part> currentParts(final Container _self) {
    final org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectProperties _self_ = org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BasicEList<Part> currentParts()
    if (_self instanceof uk.ac.kcl.inf.modelling.pls.pls.Container){
    	result = org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect._privk3_currentParts(_self_, (uk.ac.kcl.inf.modelling.pls.pls.Container)_self);
    };
    return (org.eclipse.emf.common.util.BasicEList<uk.ac.kcl.inf.modelling.pls.pls.Part>)result;
  }
  
  public static void currentParts(final Container _self, final BasicEList<Part> currentParts) {
    final org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectProperties _self_ = org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentParts(BasicEList<Part>)
    if (_self instanceof uk.ac.kcl.inf.modelling.pls.pls.Container){
    	org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect._privk3_currentParts(_self_, (uk.ac.kcl.inf.modelling.pls.pls.Container)_self,currentParts);
    };
  }
  
  protected static BasicEList<Part> _privk3_currentParts(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentParts") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.BasicEList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentParts;
  }
  
  protected static void _privk3_currentParts(final ContainerAspectContainerAspectProperties _self_, final Container _self, final BasicEList<Part> currentParts) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentParts")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentParts);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentParts = currentParts;
    }
  }
}
