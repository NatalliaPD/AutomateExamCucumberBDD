package steps;

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
import page.SetWhite;
import util.BrowserFactory;

	
	public class SetWhiteSteps {

		WebDriver driver;
		SetWhite setWhite;
		
		@Before
		public void beforeRun() {
			driver = BrowserFactory.startBrowser();
			setWhite = PageFactory.initElements(driver, SetWhite.class);
		}
		
		@Given("^Set White Background button exists$")
		    public void set_white_background_button_exists() throws Throwable {
			
			//Set implicit wait to 0
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

			//Check for element's presence
			List<WebElement> dynamicElement = driver.findElements(By.cssSelector("button[onclick = 'myFunctionWhite()']"));
			if(dynamicElement.size() != 0)
			 System.out.println("Element present");
			else
			 System.out.println("Element not present");

			//Revert back to default value of implicit wait
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
}
		  
		  @When("^I press the button$")
		    public void i_press_the_button() throws Throwable {
			setWhite.clickBackgroundButton();
			Thread.sleep(2000);
		  }
		  
	      @Then("^the background color will change to sky white$")
		   public void the_background_color_will_change_to_sky_white() throws Throwable {
	       setWhite.takeScreenshotAtEndOfTest(driver);
	    	  
	      }
	      
	      @After
	  	public void afterRun( ) {
	  		setWhite.close();
		  }
}