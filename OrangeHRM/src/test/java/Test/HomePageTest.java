package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.HomePage;
import POM.LoginPage;
import Utility.Parametrization;
@Listeners(TestListeners.class)
public class HomePageTest extends BaseTest {
    // WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver=Browser.OpenBrowser();
	}
	
	@Test(enabled=false)
	public void LoginToHomePage () throws EncryptedDocumentException, IOException {
		LoginPage loginPage=new LoginPage(driver);
		String value=Parametrization.getdata("sheet1", 0, 1);
		String values=Parametrization.getdata("Sheet1", 1, 1);
		loginPage.EnterUsername(value);
		loginPage.EnterPass(values);
		loginPage.ClickOnlogin();
		HomePage homePage=new HomePage(driver);
		homePage.Entername();
		homePage.EnterId();
		homePage.ClickOnSerch();
		
		
	}
	@Test
	public void LoginNewUser() throws EncryptedDocumentException, IOException {
		LoginPage loginPage=new LoginPage(driver);
		String value=Parametrization.getdata("sheet1", 0, 1);
		String values=Parametrization.getdata("Sheet1", 1, 1);
		loginPage.EnterUsername(value);
		loginPage.EnterPass(values);
		loginPage.ClickOnlogin();
		HomePage homePage=new HomePage(driver);
		//homePage.ClickOnPim();
		homePage.ClickOnAdd(driver);
		homePage.EnterEmpName(driver);
		homePage.EnterEmpMidlName();
		homePage.EnterEmpLastName();
		homePage.EnterEmpId();
		homePage.ClickOnSave();
	}
	
	
	@Test
	public void NewAdded() {
		System.out.println("Added new test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
