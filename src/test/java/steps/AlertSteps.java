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

public class AlertSteps {

	AccessWifiPage Ac = null;
	AlertPage alertPage = null;

	public AlertSteps() {

		Ac = new AccessWifiPage();
		alertPage = new AlertPage();
	}

	@Given("^I connected on wi-fi atmosphere already$")
	public void i_connected_on_wi_fi_atmosphere_already() {
		Ac.clickUseAppWithouLocation("NO");
		Ac.clickWifiAtmosphereDevice();

	}

	@When("^I click on refresh button$")
	public void i_click_on_refresh_button() {

		Ac.clickBtnRefreshDevice();

	}

	@Then("^I will see the name of device Connected$")
	public void i_will_see_the_name_of_device_Connected() {

		assertEquals("AtmospheraCEF9", Ac.verifyAtmosphereConnected.getText());
	}

	// ------------- Identify Icon Alert -------------------

	@When("^I click on the icon on the botton$")
	public void i_click_on_the_icon_on_the_botton() {

		Ac.clickBtnRefreshDevice();
		alertPage.clickIconAddAlert();

	}

	@Then("^Will open a alert Modal$")
	public void will_open_a_alert_Modal() {

		assertTrue(alertPage.validateFrameAddAlert.isDisplayed());
	}

	// ---------- Validate Set Time on AddAlert Modal ---------------

	@When("^Click on the Set Time$")
	public void click_on_the_Set_Time() {
		alertPage.clickBtnSetTime();
	}

	@And("^Select the hour and minute$")
	public void select_the_hour_and_minute() {
		alertPage.selectTimeAlertHour();
		alertPage.selectTimeAlertMinute();

	}

	@And("^Will click on OK$")
	public void will_click_on_OK() {

		alertPage.clickBtnOkSetClock();
	}

	@Then("^Will insert on the Time description$")
	public void will_insert_on_the_Time_description() {

		alertPage.validateTimeAlert();

	}

	// --------------------- Validate Cancel try to setTime of Alert ---------------

	@And("^Will click on Cancel$")
	public void will_click_on_Cancel() {
		alertPage.clickBtnCancelSetTime();
	}

	@Then("^Will not insert on the Time description$")
	public void will_not_insert_on_the_Time_description() {

		assertEquals(alertPage.getTimeAlertDefault(), alertPage.validateTimeAlert.getText());
	}

	// ----------------- Update Alert seTime inserted before (The Alert was not Created yet)---------------------------

	@When("^Click again on the Set Time$")
	public void click_again_on_the_Set_Time() {
		alertPage.validateTimeAlert();
		alertPage.clickBtnSetTime();
	}

	@And("^update the hour and minute$")
	public void update_the_hour_and_minute() {

		alertPage.selectTimeAlertHour();
		alertPage.selectTimeAlertMinute();
		alertPage.clickBtnOkSetClock();
	}

	@Then("^Will update on the Time description$")
	public void will_update_on_the_Time_description() {

		assertNotEquals(alertPage.getTimeAlert(), alertPage.validateTimeAlert.getText());
	}

	// ------------- Validate Set Duration item ------------------

	@When("^Click on the Set Duration$")
	public void click_on_the_Set_Duration() {
		alertPage.clickBtnSetDuration();
	}

	@And("^Select the hour and minute of Duration$")
	public void select_the_hour_and_minute_of_duration() {
		alertPage.selectDurationAlertHour();
		alertPage.selectDurationAlertMinute();

	}

	@Then("^Will insert on the Duration description$")
	public void will_insert_on_the_Duration_description() {

		alertPage.validateDurationAlert();
	}

	// ----------------- Validate Cancel try to SetDuration of Alert --------------

	@Then("^Will not insert on the Duration description$")
	public void will_not_insert_on_the_Duration_description() {
	
		assertEquals(alertPage.getSurationAlerDefault(), alertPage.validateDurationAlert.getText());
	}

	// ----------------- Update Alert Duration inserted before (The Alert was not Created yet) ---------------------------
	
	@When("^Click again on the Set Duration$")
	public void click_again_on_the_Set_Duration() {
		alertPage.validateDurationAlert();
		alertPage.clickBtnSetDuration();
	}

	@And("^update the hour and minute of Duration$")
	public void update_the_hour_and_minute_of_Duration() {
	    
		alertPage.selectDurationAlertHour();
		alertPage.selectDurationAlertMinute();
		alertPage.clickBtnOkSetClock();
		
	}

	@Then("^Will update on the Duration description$")
	public void will_update_on_the_Duration_description() {
	    
		alertPage.validateDurationAlert();
	}

	
	// ----------- Select Any weekDay ------------------------
	
	@When("^I select any Weekday$")
	public void i_select_any_Weekday() throws Throwable {
		alertPage.clickCheckWeekDays();
	}

	@Then("^Will be selected on the alert$")
	public void will_be_selected_on_the_alert() throws Throwable {
	    
	}

	//------------------- Validate Message Create Alert Without weekDay ------------------
	
	@And("^Will click on Save$")
	public void will_click_on_save() {

		alertPage.clickBtnSaveAlert();
	}
	
	@Then("^Will not create alert$")
	public void will_not_create_alert(){
	    
		assertTrue(alertPage.validateFrameAddAlert.isDisplayed());
	}

	@Then("^Will show the Weekday message$")
	public void will_show_the_weekday_message() {
	    assertEquals("Por favor selecione os dias da semana", alertPage.validateMessageSnackBar.getText());
	}
	
	
	//------------------- Validate Message Create Alert Without Duration  ------------------
	
	@Then("^Will show the Duration message$")
	public void will_show_the_duration_message() {
	    assertEquals("Por favor defina uma duração", alertPage.validateMessageSnackBar.getText());
	}
	
	
	//------------------- Validate  Create Alert With success  ------------------
	
	@Then("^Will create alert sucessfuly$")
	public void will_create_alert_sucessfuly() {
		
		alertPage.validateAlertCreated();
	}
	
}
