package CukeRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags="@signout",
		features="/Users/abrahamben/Desktop/gmail/gmailsignIn/src"
				+ "/test/resources/feature",
		glue="StepDefinition",
		plugin= {"html:target/cucmber-html-report"},
		
		dryRun = false
		
		
		
		
		
		
		)


public class Runner {

}
