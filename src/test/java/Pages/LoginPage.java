package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class LoginPage extends TestBase {
	

	
	@FindBy(id="loginusername")
	WebElement username;
	
	@FindBy(id="loginpassword")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginbtn;
	
	
	
	WebDriverWait wait;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String username, String password)
	
	{
		wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		
		
		
		username.sendKeys(username);
		password.sendKeys(password);
		loginbtn.click();
	}
}
