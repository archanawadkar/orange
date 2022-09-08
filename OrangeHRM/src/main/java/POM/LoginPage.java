package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@name='username']") private WebElement username ;
	@FindBy(xpath="//input[@name='password']") private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="(//p[contains(@class,'oxd-text')])[3]")private WebElement forgot;
	
	
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	public void EnterUsername(String user) {
		username.sendKeys(user);
	}
	public void EnterPass(String password) {
		pass.sendKeys(password);
	}
	 public void ClickOnlogin() {
		 login.click();
	 }
	
	
	
	
	
	
	
}
