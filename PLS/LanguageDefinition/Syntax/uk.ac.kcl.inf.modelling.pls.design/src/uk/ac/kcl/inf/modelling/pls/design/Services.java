package uk.ac.kcl.inf.modelling.pls.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;

import pls.xdsml.api.impl.PlsRTDAccessor;
import uk.ac.kcl.inf.modelling.pls.pls.Container;
import uk.ac.kcl.inf.modelling.pls.pls.Part;

/**
 * The services class used by VSM.
 */
public class Services extends AbstractGemocAnimatorServices  {
	
	private final SessionManagerListener sessionManagerListener = new SessionManagerListener.Stub() {
        @Override
        public void notify(Session session, int notification) {
           if (notification == SessionListener.OPENED) {
        	   session.getTransactionalEditingDomain().getCommandStack().flush();
           }
        }
    };
	
	public Services() {
		super();
		SessionManager.INSTANCE.addSessionsListener(sessionManagerListener);
	}
    
    public EList<Part> getCurrentParts(Container self) {
    	EList<Part> res = null;
    	try{
    		res = PlsRTDAccessor.getcurrentParts(self);
    	}catch(Exception e) {
    		return new BasicInternalEList(Part.class);
    	}
      return res != null ? res : new BasicInternalEList(Part.class);
    }


	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		res.add(new StringCouple("Production Line Diagram", "Default"));
		return res;
	}
}
