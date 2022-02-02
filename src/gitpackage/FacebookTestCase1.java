package gitpackage;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTestCase1 {
	
	private WebDriver driver=null;
	@BeforeTest
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","E:\\Jayanthi\\Downloads\\Selenium Download\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.facebook.com");
	}
	@Test
	public void login() {
		PageObjectClass.user_EmailId(driver).sendKeys("jayanthibs@gmail.com");
		PageObjectClass.user_Password(driver).sendKeys("jayanthi123");
		PageObjectClass.user_Login(driver).click();
		PageObjectClass.forgot_password(driver).click();
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
