package gitpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectClass {
	private static WebElement element=null;
	//checking git from eclipse
	public static WebElement user_EmailId(WebDriver driver) {
		element=driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement user_Password(WebDriver driver) {
		element = driver.findElement(By.id("pass"));
		return element;
	}
	
	public static WebElement user_Login(WebDriver driver) {
		element= driver.findElement(By.name("login"));
		return element;
	}
	
	public static WebElement forgot_password(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgot password?")));
				return element;
	}


}
