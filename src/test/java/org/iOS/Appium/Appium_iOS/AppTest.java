package org.iOS.Appium.Appium_iOS;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;

public class AppTest {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities decap=new DesiredCapabilities();
		decap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		decap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		decap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
		decap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		decap.setCapability(MobileCapabilityType.APP, "/Users/admin/Downloads/UICatalog.app");
		
		IOSDriver<IOSElement>driver=new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),decap);
		
		driver.findElementByAccessibilityId("Alert Views").click();

		driver.findElementByAccessibilityId("Text Entry").click();
		
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("ok");
		
		driver.findElementByAccessibilityId("OK").click();
		//driver.closeApp();
		
		
	}
}
