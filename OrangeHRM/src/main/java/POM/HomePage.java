package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")private WebElement name;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")private WebElement id;
	@FindBy(xpath="//button[@type='submit']")private WebElement serch;
	@FindBy(xpath="//button[@type='reset']")private WebElement reset;
    @FindBy(xpath="(//span[contains(@class,'oxd-text ')])[2]")private WebElement pim;
    @FindBy(xpath="(//button[@type='button'])[3]")private WebElement add;
	@FindBy(xpath="//input[@name='firstName']")private WebElement Firstname;
	@FindBy(xpath="//input[@name='middleName']")private WebElement midlename;
	@FindBy(xpath="//input[@name='lastName']")private WebElement lastname;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")private WebElement EmpId;
	@FindBy(xpath="//button[@type='submit']")private WebElement save;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Entername() {
		name.sendKeys("ashu");
	}
	
	public void EnterId() {
		id.sendKeys("2217");
	}
	public void ClickOnSerch() {
		serch.click();
	}
	public void ClickOnPim() {
		pim.click();
	}
	public void ClickOnAdd(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(add);
		act.click();
		act.perform();
	}
	public void EnterEmpName(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(Firstname));
		Firstname.sendKeys("ashu");
	}
	public void EnterEmpMidlName() {
		midlename.sendKeys("s");	
	}
    public void EnterEmpLastName() {
    	lastname.sendKeys("w");
	}
	public void EnterEmpId() {
		EmpId.sendKeys("2217");
	}
	public void ClickOnSave() {
		save.click();
	}
	
	
	
	
	
}
