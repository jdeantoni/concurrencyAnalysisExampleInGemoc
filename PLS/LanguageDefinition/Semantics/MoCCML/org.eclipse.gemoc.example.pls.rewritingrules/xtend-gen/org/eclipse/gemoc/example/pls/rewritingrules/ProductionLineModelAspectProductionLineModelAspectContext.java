package org.eclipse.gemoc.example.pls.rewritingrules;

import java.util.Map;
import org.eclipse.gemoc.example.pls.rewritingrules.ProductionLineModelAspectProductionLineModelAspectProperties;
import uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel;

@SuppressWarnings("all")
public class ProductionLineModelAspectProductionLineModelAspectContext {
  public static final ProductionLineModelAspectProductionLineModelAspectContext INSTANCE = new ProductionLineModelAspectProductionLineModelAspectContext();
  
  public static ProductionLineModelAspectProductionLineModelAspectProperties getSelf(final ProductionLineModel _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.example.pls.rewritingrules.ProductionLineModelAspectProductionLineModelAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProductionLineModel, ProductionLineModelAspectProductionLineModelAspectProperties> map = new java.util.WeakHashMap<uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel, org.eclipse.gemoc.example.pls.rewritingrules.ProductionLineModelAspectProductionLineModelAspectProperties>();
  
  public Map<ProductionLineModel, ProductionLineModelAspectProductionLineModelAspectProperties> getMap() {
    return map;
  }
}
