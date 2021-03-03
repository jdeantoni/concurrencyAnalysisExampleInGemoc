// AspectJ classes that have been aspectized and name
package uk.ac.kcl.inf.modelling.pls.pls;
public aspect AspectJConveyor{
void around (uk.ac.kcl.inf.modelling.pls.pls.Conveyor self)  :target (self) && (call ( void uk.ac.kcl.inf.modelling.pls.pls.Conveyor.moveAlong(  ) ) ) { org.eclipse.gemoc.example.pls.rewritingrules.ConveyorAspect.moveAlong(self );}

}
