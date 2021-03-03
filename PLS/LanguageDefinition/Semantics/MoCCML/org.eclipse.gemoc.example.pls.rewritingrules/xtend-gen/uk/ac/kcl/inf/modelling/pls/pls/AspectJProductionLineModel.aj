// AspectJ classes that have been aspectized and name
package uk.ac.kcl.inf.modelling.pls.pls;
public aspect AspectJProductionLineModel{
void around (uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel self)  :target (self) && (call ( void uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel.initialize( java.lang.String[] ) ) ) { org.eclipse.gemoc.example.pls.rewritingrules.ProductionLineModelAspect.initialize(self,(java.lang.String[])thisJoinPoint.getArgs()[0] );}

}
