/*
 * generated by Xtext 2.10.0
 */
package org.emn.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.emn.uiTest.Fill
import org.emn.uiTest.Select
import org.emn.uiTest.Selector
import org.emn.uiTest.UiTestPackage
import org.emn.uiTest.Value
import org.emn.uiTest.VariableDefinition
import org.emn.uiTest.Verify

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class UiTestScopeProvider extends AbstractUiTestScopeProvider {
	override getScope(EObject context, EReference reference) {
        if(context instanceof Value
        	&& reference == UiTestPackage.Literals.VALUE__VAR_NAME
        ) {
        	val rootElement = EcoreUtil2.getRootContainer(context)
        	val candidates = EcoreUtil2.getAllContentsOfType(rootElement, VariableDefinition)
        	println(candidates)
        	println(EcoreUtil2.getAllContentsOfType(rootElement, VariableDefinition))
        	return Scopes.scopeFor(candidates)
        }
        return super.getScope(context, reference)
    }
}
