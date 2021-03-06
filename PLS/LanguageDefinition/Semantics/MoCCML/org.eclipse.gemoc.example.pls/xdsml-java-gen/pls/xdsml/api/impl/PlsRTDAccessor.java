/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package pls.xdsml.api.impl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;

import uk.ac.kcl.inf.modelling.pls.pls.Part;
import uk.ac.kcl.inf.modelling.pls.pls.impl.ContainerImpl;


public class PlsRTDAccessor {
	public static BasicInternalEList<Part> getcurrentParts(uk.ac.kcl.inf.modelling.pls.pls.Container eObject) {
		return new BasicInternalEList<Part>(Part.class,(org.eclipse.emf.common.util.BasicEList)  getAspectProperty(eObject, "org.eclipse.gemoc.example.pls.Pls", "org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect", "currentParts"));
	}
	public static boolean setcurrentParts(EObject eObject, BasicInternalEList newValue) {
		EObjectContainmentEList<Part> temp = new EObjectContainmentEList<Part>(Part.class,(ContainerImpl)eObject, 88);
		for(Object p : newValue) {
			temp.basicAdd((Part)p, null);
		}
		return setAspectProperty(eObject, "org.eclipse.gemoc.example.pls.Pls", "org.eclipse.gemoc.example.pls.rewritingrules.ContainerAspect", "currentParts", temp);
	}

	public static Object getAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		if (aspect == null) {
			return null;
		}
		Object res = null;
		 try {
			res = aspect.getDeclaredMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()).invoke(eObject, eObject);
			if (res != null) {
				return res;
			}else {
				return null;
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	public static boolean setAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName, Object newValue) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			}
		}
		if (aspect == null) {
			return false;
		}
			 try {
				 aspect.getMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className(), newValue.getClass()).invoke(eObject, eObject, newValue);
				return true;
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).getClass().getInterfaces()) {
						
						try {
							aspect.getMethod(propertyName, c, newValue.getClass()).invoke(eObject, eObject, newValue);
							return true;
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()+"::set"+propertyName);
						}
					}
				}
			return false;
	}
};