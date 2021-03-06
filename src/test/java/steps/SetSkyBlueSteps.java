package steps;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SetBlue;
import util.BrowserFactory;

public class SetSkyBlueSteps {

	WebDriver driver;
	SetBlue setBlue;
	
	@Before
	public void beforeRun() {
	driver = BrowserFactory.startBrowser();
	setBlue = PageFactory.initElements(driver, SetBlue.class);
	
	}
	
	@Given("^SetSkyBlue Background button exists$")
	    public void setskyblue_background_button_exists() throws InterruptedException {
		;
		

		//Set implicit wait to 0
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		//Check for element's presence
		List<WebElement> dynamicElement = driver.findElements(By.cssSelector("button[onclick = 'myFunctionSky()']"));
		if(dynamicElement.size() != 0)
		 System.out.println("Element present");
		else
		 System.out.println("Element not present");

		//Revert back to default value of implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	 }
	 
	 @When("^I click on the button$")
	    public void i_click_on_the_button() throws Throwable {
		 setBlue.clickBackgroundButton();
		 Thread.sleep(2000);
}

	 @Then("^the background color will change to sky blue$")
	    public void the_background_color_will_change_to_sky_blue() throws IOException {
		 setBlue.takeScreenshotAtEndOfTest(driver);
}
	  
     @After
 	public void afterRun( ) {
 		setBlue.close();
	  }
}