/*
 * generated by Xtext 2.10.0
 */
package org.emn.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractUiTestValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.emn.uiTest.UiTestPackage.eINSTANCE);
		return result;
	}
	
}
