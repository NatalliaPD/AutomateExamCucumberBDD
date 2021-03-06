package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features", //features key word package name
		glue = "steps", //package name
		tags = "@SetColorBlue", 
		monochrome = true, //shows in understandable format when true
		dryRun = false,  //will check for compilation errors when true //strict = true, doesn't skip undefined steps
		plugin = {      //type of reporting
				"pretty",
				"html: target/cucumber",
				"json: target/cucumber.json"
}
		
)
  public class SetBlueRunner {
	

}
