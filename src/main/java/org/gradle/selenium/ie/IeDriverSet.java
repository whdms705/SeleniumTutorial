package org.gradle.selenium.ie;

import org.gradle.selenium.CallbackEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IeDriverSet implements CallbackEvent {
	WebDriver driver;
	
	@Override
	public WebDriver init(){
		System.out.println("ie setting start ");
		System.setProperty("webdriver.ie.driver","C:/Driver/IEDriverServer_x64_2.53.1/IEDriverServer.exe");

		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		capability.setCapability("nativeEvents", false);    
		capability.setCapability("unexpectedAlertBehaviour", "accept");
		capability.setCapability("ignoreProtectedModeSettings", true);
		driver = new InternetExplorerDriver(capability);
		return driver;
	}
}
