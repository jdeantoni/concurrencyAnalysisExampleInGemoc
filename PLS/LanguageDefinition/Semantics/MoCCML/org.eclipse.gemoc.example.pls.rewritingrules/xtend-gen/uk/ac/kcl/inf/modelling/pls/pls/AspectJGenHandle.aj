// AspectJ classes that have been aspectized and name
package uk.ac.kcl.inf.modelling.pls.pls;
public aspect AspectJGenHandle{
void around (uk.ac.kcl.inf.modelling.pls.pls.GenHandle self)  :target (self) && (call ( void uk.ac.kcl.inf.modelling.pls.pls.GenHandle.work(  ) ) ) { org.eclipse.gemoc.example.pls.rewritingrules.GenHandleAspect.work(self );}

}
