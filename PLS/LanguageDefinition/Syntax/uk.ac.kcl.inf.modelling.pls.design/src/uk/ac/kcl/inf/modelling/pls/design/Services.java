package uk.ac.kcl.inf.modelling.pls.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import pls.xdsml.api.impl.PlsRTDAccessor;
import uk.ac.kcl.inf.modelling.pls.pls.Container;
import uk.ac.kcl.inf.modelling.pls.pls.Part;

/**
 * The services class used by VSM.
 */
public class Services extends AbstractGemocAnimatorServices  {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public ArrayList<Part> getCurrentParts(Container self) {
    	ArrayList res = PlsRTDAccessor.getCurrentParts(self);
      return res != null ? res : new ArrayList();
    }

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		res.add(new StringCouple("Production Line Diagram", "Default"));
		return res;
	}
}
