package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccessWifiPage extends PageBase {

	@AndroidFindBy(id = "android:id/button3")
	public MobileElement btnUseNfcOff;

	@AndroidFindBy(xpath = "//*[@content-desc='Open navigation drawer']")
	public MobileElement centralMenu;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Alerts']")
	public MobileElement subMenuAlert;

	@AndroidFindBy(id = "net.unitecgroup.www.unitecrfid:id/buttonScan")
	public MobileElement btnScan;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='net empresa 136']")
	public MobileElement wifiAtmosphereDevice;

	@AndroidFindBy(id = "Mais opções")
	public MobileElement btnRightMenu;

	@AndroidFindBy(className = "android.widget.TextView")
	public List<MobileElement> rightSubMenuOptions;
	
	@AndroidFindBy(id = "net.unitecgroup.www.unitecrfid:id/textViewBeacon")
	public MobileElement verifyAtmosphereConnected;
	
	@AndroidFindBy(id = "net.unitecgroup.www.unitecrfid:id/buttonRefresh")
	public MobileElement btnRefreshDevice;
	


	public void clickUseAppWithouNFC() {

		if (btnUseNfcOff.isEnabled()) {
			btnUseNfcOff.click();
		} else {

		}

	}

	public void clickCentralMenu() {

		centralMenu.click();
	}

	public void clickSubMenuAlert() {
		subMenuAlert.click();
	}

	public void clickBtnScan() {
		btnScan.click();
	}

	public void clickWifiAtmosphereDevice() {
		wifiAtmosphereDevice.click();
	}

	public void clickOnRightMenu() {
		btnRightMenu.click();
	}
	
	public void clickOnRightSubMenuOption(String option) {

		 int i, size;
    	 size = rightSubMenuOptions.size();

		 for (i = 0; i < size; i++) {

		 String text = rightSubMenuOptions.get(i).getText();

		if(text.toLowerCase().equals(option.toLowerCase())) {	 
		
			switch(option) {
	
		case "Add Alerts":
			rightSubMenuOptions.get(i).click();
			i = size;
			
			break;

		case "Remove Alerts":
			rightSubMenuOptions.get(i).click();
			i = size;
			break;

		case "Update Alerts":
			rightSubMenuOptions.get(i).click();
			i = size;
			break;

		case "Reset":
			rightSubMenuOptions.get(i).click();
			i = size;
			break;

		case "Get Alerts":
			rightSubMenuOptions.get(i).click();
			i = size;
			break;

		case "Set Time":
			rightSubMenuOptions.get(i).click();
			i = size;
			break;

		case "Get Time":
			rightSubMenuOptions.get(i).click();
			i = size;
			break;

		case "Change Password":
			rightSubMenuOptions.get(i).click();
			i = size;
			break;

		default:
			break;
	 	 }

		}

      }
	}
	
	public void clickBtnRefreshDevice() {
		btnRefreshDevice.click();
	}
	
}
