package org.eclipse.gemoc.example.pls.rewritingrules;

import java.util.Map;
import org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectProperties;
import uk.ac.kcl.inf.modelling.pls.pls.Container;

@SuppressWarnings("all")
public class ContainerAspectContainerAspectContext {
  public static final ContainerAspectContainerAspectContext INSTANCE = new ContainerAspectContainerAspectContext();
  
  public static ContainerAspectContainerAspectProperties getSelf(final Container _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Container, ContainerAspectContainerAspectProperties> map = new java.util.WeakHashMap<uk.ac.kcl.inf.modelling.pls.pls.Container, org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspectContainerAspectProperties>();
  
  public Map<Container, ContainerAspectContainerAspectProperties> getMap() {
    return map;
  }
}
