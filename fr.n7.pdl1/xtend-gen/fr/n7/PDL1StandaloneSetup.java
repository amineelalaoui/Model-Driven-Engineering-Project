/**
 * generated by Xtext 2.17.1
 */
package fr.n7;

import fr.n7.PDL1StandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PDL1StandaloneSetup extends PDL1StandaloneSetupGenerated {
  public static void doSetup() {
    new PDL1StandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}