/**
 * generated by Xtext 2.10.0
 */
package org.emn;

import org.emn.UiTestStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class UiTestStandaloneSetup extends UiTestStandaloneSetupGenerated {
  public static void doSetup() {
    UiTestStandaloneSetup _uiTestStandaloneSetup = new UiTestStandaloneSetup();
    _uiTestStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
