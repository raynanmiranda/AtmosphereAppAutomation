package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AlertPage extends PageBase {

	protected String timeAlertDefault = null;
	protected String durationAlertDefault = null;
	protected String timeAlert = null;
	protected String durationAlert = null;
	protected String getHourTime = null;
	protected String getMinuteTime = null;
	protected String getHourDuration = null;
	protected String getMinuteDuration = null;
	protected int weekRandom;

	@AndroidFindBy(id = "net.unitecgroup.www.unitecrfid:id/fab")
	public MobileElement iconAddAlert;

	@AndroidFindBy(className = "android.widget.FrameLayout")
	public MobileElement validateFrameAddAlert;

	@AndroidFindBy(id = "net.unitecgroup.www.unitecrfid:id/buttonSetTime")
	public MobileElement btnSetTime;

	@AndroidFindBy(id = "net.unitecgroup.www.unitecrfid:id/buttonSetDuration")
	public MobileElement btnSetDuration;

	@AndroidFindBy(className = "android.widget.CheckBox")
	public List<MobileElement> checkWeekDays;

	@AndroidFindBy(className = "android.widget.RadialTimePickerView$RadialPickerTouchHelper")
	public List<MobileElement> radialPickerTime;

	@AndroidFindBy(id = "android:id/hours")
	public MobileElement getHourAlertTime;;

	@AndroidFindBy(id = "android:id/minutes")
	public MobileElement getMinuteAlertTime;

	@AndroidFindBy(id = "android:id/button1")
	public MobileElement btnOkSetTime;

	@AndroidFindBy(id = "android:id/button2")
	public MobileElement btnCancelSetTime;

	@AndroidFindBy(id = "net.unitecgroup.www.unitecrfid:id/textViewTime")
	public MobileElement validateTimeAlert;

	@AndroidFindBy(id = "net.unitecgroup.www.unitecrfid:id/textViewDuration")
	public MobileElement validateDurationAlert;
	
	@AndroidFindBy(id = "net.unitecgroup.www.unitecrfid:id/snackbar_text")
	public MobileElement validateMessageSnackBar;
	
	@AndroidFindBy(id = "android:id/button1")
	public MobileElement btnSaveAlert;
	

	public void clickIconAddAlert() {

		iconAddAlert.click();
	}

	public void clickBtnSetTime() {

		timeAlertDefault = validateTimeAlert.getText();
		btnSetTime.click();
	}

	public void clickBtnSetDuration() {
		durationAlertDefault = validateDurationAlert.getText();
		btnSetDuration.click();
	}

	public void clickCheckWeekDays() {

		Random number = new Random();
		int sizeWeek;

		sizeWeek = checkWeekDays.size();
		weekRandom = number.nextInt(sizeWeek);
		checkWeekDays.get(weekRandom).click();

		
	}

	public void selectTimeAlertHour() {

		Random number = new Random();
		int sizeTime, numberRandom;

		sizeTime = radialPickerTime.size();
		numberRandom = number.nextInt(sizeTime);
		radialPickerTime.get(numberRandom).click();
		getHourTime = getHourAlertTime.getText();

	}

	public void selectTimeAlertMinute() {

		Random number = new Random();
		int sizeTime, numberRandom;

		sizeTime = radialPickerTime.size();
		numberRandom = number.nextInt(sizeTime);
		radialPickerTime.get(numberRandom).click();
		getMinuteTime = getMinuteAlertTime.getText();

	}

	public void selectDurationAlertHour() {

		Random number = new Random();
		int sizeTime, numberRandom;

		sizeTime = radialPickerTime.size();
		numberRandom = number.nextInt(sizeTime);
		radialPickerTime.get(numberRandom).click();
		getHourDuration = getHourAlertTime.getText();

	}

	public void selectDurationAlertMinute() {

		Random number = new Random();
		int sizeTime, numberRandom;

		sizeTime = radialPickerTime.size();
		numberRandom = number.nextInt(sizeTime);
		radialPickerTime.get(numberRandom).click();
		getMinuteDuration = getMinuteAlertTime.getText();

	}

	public void clickBtnOkSetClock() {

		btnOkSetTime.click();
	}

	public void clickBtnCancelSetTime() {

		btnCancelSetTime.click();
	}

	public void validateTimeAlert() {

		// System.out.println(validateTimeAlert.getText());
		timeAlert = getHourTime + ":" + getMinuteTime;
		assertEquals(timeAlert, validateTimeAlert.getText());
	}

	public void validateDurationAlert() {

		durationAlert = getHourDuration + ":" + getMinuteDuration;
		assertEquals(durationAlert, validateDurationAlert.getText());

	}
	
	public void validateCheckWeekDay() {
		
		assertTrue(checkWeekDays.get(weekRandom).isSelected());
	}
	
	public void clickBtnSaveAlert() {
		btnSaveAlert.click();
	}

}
