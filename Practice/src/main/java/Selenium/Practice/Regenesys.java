package Selenium.Practice;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

@Test
public class Regenesys 
{
	public static WebDriver driver;
	public static WebDriverWait wait;

	//Web Elements
	public By numberTextBox=By.id("login1");
	public By proceedButton=By.xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text button__MyButton-sc-z05sv7-0 bmUSTf']");
	public By OTPDigitOne=By.xpath("//*[@class='otp-group']/input[1]");
	public By OTPDigitTwo=By.xpath("//*[@class='otp-group']/input[2]");
	public By OTPDigitThree=By.xpath("//*[@class='otp-group']/input[3]");
	public By OTPDigitFour=By.xpath("//*[@class='otp-group']/input[4]");
	public By verifyButton=By.xpath("//*[text()='Verify']");
	public By applyNow=By.xpath("//*[text()='Apply Now']");

	//Locators for personal Information form
	public By firstName=By.id("firstName");
	public By middleName=By.id("middleName");
	public By lastName=By.id("lastName");
	public By DOB=By.id("exampleFormControlInput1");
	public By email=By.id("email");
	public By isInternational=By.name("isInternational");
	public By identificationPassportNumber=By.id("identificationPassportNumber");
	public By postalAddress=By.id("postalAddress");
	public By city=By.name("address[0].city");
	public By state=By.name("address[0].state");
	public By postalZipCode=By.id("postalZipCode");
	public By selectSameAsPostalAddress=By.id("flexCheckDefault");
	public By highSchoolName=By.id("highSchoolName");
	public By internationalDegree=By.name("education.isInternationDegree");
	public By isSponsored=By.xpath("(//*[@name='sponsor.isSponsored'])[2]");
	public By isEmployed=By.xpath("(//*[@name='employment.isEmployed'])[2]");
	public By isKin=By.xpath("(//*[@name='kin.isKin'])[2]");
	public By isAgreedTermsAndConditions=By.name("isAgreedTermsAndConditions");
	public By saveAndNext=By.xpath("//*[@class='mt-4 text-center']/button[2]");


	public void intialize() throws InterruptedException {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofMillis(20));
		driver.get("https://dev-apply.regenesys.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		//LOGIN
		driver.findElement(numberTextBox).sendKeys("9560499629");
		driver.findElement(proceedButton).click();
		driver.findElement(OTPDigitOne).sendKeys("1");
		driver.findElement(OTPDigitTwo).sendKeys("2");
		driver.findElement(OTPDigitThree).sendKeys("3");
		driver.findElement(OTPDigitFour).sendKeys("4");
		driver.findElement(verifyButton).click();
		try {
			driver.findElement(applyNow).click();
		}catch(StaleElementReferenceException ex) {
			driver.findElement(applyNow).click();
		}

		//Fill Form
		Thread.sleep(2000);
		driver.findElement(firstName).sendKeys("Neeraj");
		driver.findElement(middleName).sendKeys("Kumar");
		driver.findElement(lastName).sendKeys("Singh");
		Select gender=new Select(driver.findElement(By.name("lead.gender")));
		gender.selectByValue("M");
		driver.findElement(DOB).sendKeys("22-01-1997");
		driver.findElement(email).sendKeys("NNN@gmail.com");
		Select language=new Select(driver.findElement(By.name("lead.language")));
		language.selectByValue("ENG");
		Select race=new Select(driver.findElement(By.name("lead.race")));
		race.selectByValue("BLACK");
		driver.findElement(isInternational).click();
		driver.findElement(identificationPassportNumber).sendKeys("132456789123");
		Select nationality=new Select(driver.findElement(By.name("lead.nationality")));
		nationality.selectByValue("IND");
		driver.findElement(postalAddress).sendKeys("janak");
		driver.findElement(city).sendKeys("delhi");
		driver.findElement(state).sendKeys("delhi");
		Select country=new Select(driver.findElement(By.name("address[0].country")));
		country.selectByValue("India");
		driver.findElement(postalZipCode).sendKeys("110059");
		driver.findElement(selectSameAsPostalAddress).click();
		Select education=new Select(driver.findElement(By.name("education.programCode")));
		education.selectByValue("BSCPT");
		Select highest=new Select(driver.findElement(By.name("education.qualificationCode")));
		highest.selectByValue("MAT");
		driver.findElement(highSchoolName).sendKeys("Gagan Bharti");
		driver.findElement(internationalDegree).click();
		Select type=new Select(driver.findElement(By.name("education.studentTypeCode")));
		type.selectByValue("REGULAR");
		Select agent=new Select(driver.findElement(By.name("education.referredById")));
		agent.selectByValue("AGENT");
		Select agentCode=new Select(driver.findElement(By.name("education.agentCode")));
		agentCode.selectByValue("ABRI");
		driver.findElement(isSponsored).click();
		driver.findElement(isEmployed).click();
		driver.findElement(isKin).click();
		driver.findElement(isAgreedTermsAndConditions).click();
		driver.findElement(saveAndNext).click();
	}
}
