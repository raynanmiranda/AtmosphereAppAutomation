package bases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class PageBase {

protected AppiumDriver<MobileElement> driverMobile;
	
	public PageBase() {
		PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.getInstance()), this);
		this.driverMobile = DriverFactory.getInstance();
		driverMobile.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
	
}
