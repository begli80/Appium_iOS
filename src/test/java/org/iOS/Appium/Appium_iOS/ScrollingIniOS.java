package org.iOS.Appium.Appium_iOS;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

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
		String elementID = driver.findElementByAccessibilityId("Toolbars").getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", elementID);                                  // for scrolling to a certain element
		scrollObject.put("toVisible", "not an empty string");
		js.executeScript("mobile:scroll", scrollObject);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, String>scrollObject = new HashMap<>();
//        scrollObject.put("direction", "down");                                  // for scrolling down    
//        js.executeScript("mobile: scroll", scrollObject);
        
        
        
        
		//driver.closeApp();
	}

}
