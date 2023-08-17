package Methods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Selenium.Practice.Base;

public class Methods extends Base{
	WebDriver driver;
	
	public Methods(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	
	public void sendKeys(By element, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(value);
	}

	// To perform click operation
	public void click(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

}
