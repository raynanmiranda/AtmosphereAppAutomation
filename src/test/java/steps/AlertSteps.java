package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AlertPage;
import pages.AccessWifiPage;

public class AlertSteps extends AlertPage {

	AccessWifiPage Ac = null;

	public AlertSteps() {

		Ac = new AccessWifiPage();
	}

	@Given("^I connected on wi-fi atmosphere already$")
	public void i_connected_on_wi_fi_atmosphere_already() {
		Ac.clickUseAppWithouNFC();
		Ac.clickCentralMenu();
		Ac.clickSubMenuAlert();
		Ac.clickWifiAtmosphereDevice();

	}

	@When("^I click on refresh button$")
	public void i_click_on_refresh_button() {

		Ac.clickBtnRefreshDevice();

	}

	@Then("^I will see the name of device Connected$")
	public void i_will_see_the_name_of_device_Connected() {

		assertEquals("net empresa 136", Ac.verifyAtmosphereConnected.getText());
	}

	// ------------- Identify Icon Alert -------------------

	@When("^I click on the icon on the botton$")
	public void i_click_on_the_icon_on_the_botton() {

		Ac.clickBtnRefreshDevice();
		clickIconAddAlert();

	}

	@Then("^Will open a alert Modal$")
	public void will_open_a_alert_Modal() {

		assertTrue(validateFrameAddAlert.isDisplayed());
	}

	// ---------- Validate Set Time on AddAlert Modal ---------------

	@When("^Click on the Set Time$")
	public void click_on_the_Set_Time() {
		clickBtnSetTime();
	}

	@And("^Select the hour and minute$")
	public void select_the_hour_and_minute() {
		selectTimeAlertHour();
		selectTimeAlertMinute();

	}

	@And("^Will click on OK$")
	public void will_click_on_OK() {

		clickBtnOkSetClock();
	}

	@Then("^Will insert on the Time description$")
	public void will_insert_on_the_Time_description() {

		validateTimeAlert();

	}

	// --------------------- Validate Cancel try to setTime of Alert ---------------

	@And("^Will click on Cancel$")
	public void will_click_on_Cancel() {
		clickBtnCancelSetTime();
	}

	@Then("^Will not insert on the Time description$")
	public void will_not_insert_on_the_Time_description() {

		assertEquals(timeAlertDefault, validateTimeAlert.getText());
	}

	// ----------------- Update Alert seTime inserted before (The Alert was not Created yet)---------------------------

	@When("^Click again on the Set Time$")
	public void click_again_on_the_Set_Time() {
		validateTimeAlert();
		clickBtnSetTime();
	}

	@And("^update the hour and minute$")
	public void update_the_hour_and_minute() {

		selectTimeAlertHour();
		selectTimeAlertMinute();
		clickBtnOkSetClock();
	}

	@Then("^Will update on the Time description$")
	public void will_update_on_the_Time_description() {

		assertNotEquals(timeAlert, validateTimeAlert.getText());
	}

	// ------------- Validate Set Duration item ------------------

	@When("^Click on the Set Duration$")
	public void click_on_the_Set_Duration() {
		clickBtnSetDuration();
	}

	@And("^Select the hour and minute of Duration$")
	public void select_the_hour_and_minute_of_duration() {
		selectDurationAlertHour();
		selectDurationAlertMinute();

	}

	@Then("^Will insert on the Duration description$")
	public void will_insert_on_the_Duration_description() {

		validateDurationAlert();
	}

	// ----------------- Validate Cancel try to SetDuration of Alert --------------

	@Then("^Will not insert on the Duration description$")
	public void will_not_insert_on_the_Duration_description() {
	
		assertEquals(durationAlertDefault, validateDurationAlert.getText());
	}

	// ----------------- Update Alert Duration inserted before (The Alert was not Created yet) ---------------------------
	
	@When("^Click again on the Set Duration$")
	public void click_again_on_the_Set_Duration() {
	    validateDurationAlert();
	    clickBtnSetDuration();
	}

	@And("^update the hour and minute of Duration$")
	public void update_the_hour_and_minute_of_Duration() {
	    
		selectDurationAlertHour();
		selectDurationAlertMinute();
		clickBtnOkSetClock();
	}

	@Then("^Will update on the Duration description$")
	public void will_update_on_the_Duration_description() {
	    
		assertEquals(durationAlert, validateDurationAlert.getText());
	}

	
	// ----------- Select Any weekDay ------------------------
	
	@When("^I select any Weekday$")
	public void i_select_any_Weekday() throws Throwable {
	    clickCheckWeekDays();
	}

	@Then("^Will be selected on the alert$")
	public void will_be_selected_on_the_alert() throws Throwable {
	    
	}

	//------------------- Validate Message Create Alert Without weekDay ------------------
	
	@And("^Will click on Save$")
	public void will_click_on_save() {

		clickBtnSaveAlert();
	}
	
	@Then("^Will not create alert$")
	public void will_not_create_alert(){
	    
		assertTrue(validateFrameAddAlert.isDisplayed());
	}

	@Then("^Will show the message$")
	public void will_show_the_message() {
	    assertEquals("Please select weekdays", validateMessageWeekDays.getText());
	}
	
	
}
