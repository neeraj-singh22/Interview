package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Methods.Methods;

public class LoginPage extends Methods{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//elements on signIn page
	private By username=By.cssSelector("#Username");
	private By password = By.cssSelector("#Password"); 
	private By signin  = By.xpath("//*[contains(text(),'Sign in')]");
			
			
	
}
