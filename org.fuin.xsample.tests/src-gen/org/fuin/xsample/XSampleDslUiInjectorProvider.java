/*
* generated by Xtext
*/
package org.fuin.xsample;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class XSampleDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.fuin.xsample.ui.internal.XSampleDslActivator.getInstance().getInjector("org.fuin.xsample.XSampleDsl");
	}
	
}
