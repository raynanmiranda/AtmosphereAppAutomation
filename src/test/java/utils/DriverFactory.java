package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

static AppiumDriver<MobileElement> INSTANCEMOBILE;
	
	public static void initializeDriverAppium() throws MalformedURLException {
	
		DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Configuration.PLATFORM_NAME);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, Configuration.DEVICE_NAME);
	cap.setCapability("appPackage",Configuration.APP_PACKAGE);
	cap.setCapability("appActivity",Configuration.APP_ACTIVITY);
	INSTANCEMOBILE = new AndroidDriver<MobileElement>(new URL(Configuration.REMOTE_MOBILE_URL), cap);
	INSTANCEMOBILE.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	
	}
	public static AppiumDriver<MobileElement> getInstance() {
		return INSTANCEMOBILE;
	}
	
	public static void quitDriver() {
		INSTANCEMOBILE.quit();
		INSTANCEMOBILE = null;
	}
	
}
