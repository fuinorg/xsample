/*
 * generated by Xtext
 */
package org.fuin.xsample.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractXSampleDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.fuin.xsample.xSampleDsl.XSampleDslPackage.eINSTANCE);
		return result;
	}
}