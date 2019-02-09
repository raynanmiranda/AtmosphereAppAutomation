package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "src/test/java/features/AlertPage.feature", 
				     glue = {"steps","hook"},
				     tags = {"@SaveAlertSuccess"}
				)

public class ExecutionAlertTest {

}
