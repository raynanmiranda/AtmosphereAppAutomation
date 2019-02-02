package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccessWifiPage;

public class AccessWifiSteps extends AccessWifiPage {

	
	@Given("^I open the App$")
	public void i_open_the_app() {
		
		clickUseAppWithouLocation("NO");
		
	}
	
	
	@When("^Click on Scan$")
	public void click_on_scan() {
		clickBtnScan();
	}
	
	@Then("^Will be able to find wi-fi connection$")
	public void will_be_able_to_find_wi_fi_connection() {
		
		assertEquals("AtmospheraCEF9", wifiAtmosphereDevice.getText());
	}
	
	


	//------- Connection with atmosphere component
	
	@When("^I click on the Atmosphere Wi-fi$")
	public void i_click_on_the_Atmosphere_Wi_fi() {
	    clickWifiAtmosphereDevice();
	}

	@Then("^I will be start to have conection with the component$")
	public void i_will_be_start_to_have_conection_with_the_component() {
	    
		clickBtnRefreshDevice();
		assertEquals("AtmospheraCEF9", verifyAtmosphereConnected.getText());
	}

	
	
}
