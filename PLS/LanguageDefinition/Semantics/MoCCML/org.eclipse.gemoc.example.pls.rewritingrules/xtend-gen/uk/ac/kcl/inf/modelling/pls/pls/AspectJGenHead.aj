// AspectJ classes that have been aspectized and name
package uk.ac.kcl.inf.modelling.pls.pls;
public aspect AspectJGenHead{
void around (uk.ac.kcl.inf.modelling.pls.pls.GenHead self)  :target (self) && (call ( void uk.ac.kcl.inf.modelling.pls.pls.GenHead.work(  ) ) ) { org.eclipse.gemoc.example.pls.rewritingrules.GenHeadAspect.work(self );}

}
