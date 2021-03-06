package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SetBlue {

	WebDriver driver;

	public SetBlue(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	//@FindBy(how = How.NAME, using = "Set SkyBlue Background")
    @FindBy(how = How.CSS, using = "button[onclick = 'myFunctionSky()']")
	WebElement SkyBlueBackgorundButton;


//Interactive method

	public void clickBackgroundButton() {
	SkyBlueBackgorundButton.click();

	}
	

	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currrentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png"));
	}
	
	public void close() {
		driver.close();
		driver.quit();
	}
}