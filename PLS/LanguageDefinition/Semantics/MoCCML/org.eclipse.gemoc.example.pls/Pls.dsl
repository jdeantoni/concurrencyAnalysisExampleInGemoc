metaprog = org.eclipse.gemoc.metaprog.moccml
name	= org.eclipse.gemoc.example.pls.Pls
ecore 	= platform:/resource/uk.ac.kcl.inf.modelling.pls.model/model/model.ecore
k3 		= org.eclipse.gemoc.example.pls.rewritingrules.ConveyorAspect,\
	 	  org.eclipse.gemoc.example.pls.rewritingrules.GenHandleAspect,\
	 	  org.eclipse.gemoc.example.pls.rewritingrules.GenHeadAspect,\
	 	  org.eclipse.gemoc.example.pls.rewritingrules.AssemblerAspect,\
	 	  org.eclipse.gemoc.example.pls.rewritingrules.ProductionLineModelAspect,\
	 	  org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect
ecl 	= /org.eclipse.gemoc.exmaple.pls.dse/ecl/pls.ecl