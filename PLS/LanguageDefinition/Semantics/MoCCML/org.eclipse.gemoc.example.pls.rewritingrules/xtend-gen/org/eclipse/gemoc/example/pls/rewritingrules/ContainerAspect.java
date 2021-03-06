package org.eclipse.gemoc.example.pls.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Containment;
import java.util.ArrayList;
import org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectProperties;
import uk.ac.kcl.inf.modelling.pls.pls.Container;
import uk.ac.kcl.inf.modelling.pls.pls.Part;

@Aspect(className = Container.class)
@SuppressWarnings("all")
public class ContainerAspect {
  @Containment
  public static ArrayList<Part> currentParts(final Container _self) {
    final org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectProperties _self_ = org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ArrayList<Part> currentParts()
    if (_self instanceof uk.ac.kcl.inf.modelling.pls.pls.Container){
    	result = org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect._privk3_currentParts(_self_, (uk.ac.kcl.inf.modelling.pls.pls.Container)_self);
    };
    return (java.util.ArrayList<uk.ac.kcl.inf.modelling.pls.pls.Part>)result;
  }
  
  @Containment
  public static void currentParts(final Container _self, final ArrayList<Part> currentParts) {
    final org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectProperties _self_ = org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentParts(ArrayList<Part>)
    if (_self instanceof uk.ac.kcl.inf.modelling.pls.pls.Container){
    	org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect._privk3_currentParts(_self_, (uk.ac.kcl.inf.modelling.pls.pls.Container)_self,currentParts);
    };
  }
  
  protected static ArrayList<Part> _privk3_currentParts(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentParts") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.ArrayList) ret;
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
  
  protected static void _privk3_currentParts(final ContainerAspectContainerAspectProperties _self_, final Container _self, final ArrayList<Part> currentParts) {
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
