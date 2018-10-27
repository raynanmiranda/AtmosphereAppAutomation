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
		
		clickUseAppWithouNFC();
		
	}
	
	@And("^Access the menu 'Alert'$")
	public void access_the_menu_alert() {
		
		clickCentralMenu();
		clickSubMenuAlert();
		
	}
	
	@When("^Click on Scan$")
	public void click_on_scan() {
		clickBtnScan();
	}
	
	@Then("^Will be able to find wi-fi connection$")
	public void will_be_able_to_find_wi_fi_connection() {
		
		assertEquals("net empresa 136", wifiAtmosphereDevice.getText());
	}
	
	
	//------------ Validate Right menu without Connection ------
	
	@When("^I Click on right menu$")
	public void i_Click_on_right_menu(){
	    clickOnRightMenu();
	}

	@When("^click on (.*)$")
	public void click_on_AddAlerts(String option){
	    clickOnRightSubMenuOption(option);
		
	}

	@Then("^Will not change$")
	public void will_not_change() {
	    
		assertTrue(btnScan.isDisplayed());
		
	}


	//------- Connection with atmosphere component
	
	@When("^I click on the Atmosphere Wi-fi$")
	public void i_click_on_the_Atmosphere_Wi_fi() {
	    clickWifiAtmosphereDevice();
	}

	@Then("^I will be start to have conection with the component$")
	public void i_will_be_start_to_have_conection_with_the_component() {
	    
		clickBtnRefreshDevice();
		assertEquals("net empresa 136", verifyAtmosphereConnected.getText());
	}

	
	
}
