package org.iOS.Appium.Appium_iOS;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollingIniOS {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities decap=new DesiredCapabilities();
		decap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		decap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		decap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
		decap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		decap.setCapability(MobileCapabilityType.APP, "/Users/admin/Downloads/UICatalog.app");
		
		IOSDriver<IOSElement>driver=new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),decap);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String elementID = driver.findElementByAccessibilityId("Steppers").getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", elementID);                                  // for scrolling to a certain element
		scrollObject.put("toVisible", "not an empty string");
		js.executeScript("mobile:scroll", scrollObject);
		
		
		// Click on Steppers and do some operations
		
		driver.findElementByAccessibilityId("Steppers").click();
		List<IOSElement> increment=driver.findElementsByName("Increment");
		increment.get(0).click();
		increment.get(0).click();
		System.out.println("Default: "+driver.findElementsByClassName("XCUIElementTypeStaticText").get(0).getText());
		increment.get(1).click();
		System.out.println("Tinted: "+driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		increment.get(2).click();
		increment.get(2).click();
		System.out.println("Custom: "+driver.findElementsByClassName("XCUIElementTypeStaticText").get(2).getText());
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, String>scrollObject = new HashMap<>();
//        scrollObject.put("direction", "down");                                  // for scrolling down    
//        js.executeScript("mobile: scroll", scrollObject);
        
        
        
        
		//driver.closeApp();
	}

}
