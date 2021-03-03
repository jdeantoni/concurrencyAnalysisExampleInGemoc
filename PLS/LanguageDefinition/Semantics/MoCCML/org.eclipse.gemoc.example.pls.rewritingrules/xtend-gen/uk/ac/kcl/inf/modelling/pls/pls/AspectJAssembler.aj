// AspectJ classes that have been aspectized and name
package uk.ac.kcl.inf.modelling.pls.pls;
public aspect AspectJAssembler{
void around (uk.ac.kcl.inf.modelling.pls.pls.Assembler self)  :target (self) && (call ( void uk.ac.kcl.inf.modelling.pls.pls.Assembler.work(  ) ) ) { org.eclipse.gemoc.example.pls.rewritingrules.AssemblerAspect.work(self );}

}
