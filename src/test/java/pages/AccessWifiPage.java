package pages;


import bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccessWifiPage extends PageBase {

	@AndroidFindBy(id = "android:id/button2")
	public MobileElement btnActivateLocationNO;
	
	@AndroidFindBy(id = "android:id/button1")
	public MobileElement btnActivateLocationYES;


	@AndroidFindBy(id = "br.com.dahmotta.www.atmosphera:id/buttonScan")
	public MobileElement btnScan;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='AtmospheraCEF9']")
	public MobileElement wifiAtmosphereDevice;

	
	@AndroidFindBy(id = "br.com.dahmotta.www.atmosphera:id/textViewBeacon")
	public MobileElement verifyAtmosphereConnected;
	
	@AndroidFindBy(id = "br.com.dahmotta.www.atmosphera:id/buttonRefresh")
	public MobileElement btnRefreshDevice;
	


	public void clickUseAppWithouLocation(String enableLocation) {

		
		try {
		
			if (btnActivateLocationNO.isDisplayed()) {
			
				if(enableLocation.equalsIgnoreCase("no")) {
					
					btnActivateLocationNO.click();
				}
				else if(enableLocation.equalsIgnoreCase("yes")) {
					
					btnActivateLocationYES.click();
				}
		} 

		}
		catch(Exception e){
			
		}
	}


	public void clickBtnScan() {
		btnScan.click();
	}

	public void clickWifiAtmosphereDevice() {
		wifiAtmosphereDevice.click();
	}

      
	
	public void clickBtnRefreshDevice() {
		btnRefreshDevice.click();
	}
	
}
