package stepDefintions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

public class Login {
	WebDriver driver=new FirefoxDriver();
	@Given("^Inside SetUp$")
	public void inside_SetUp() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://192.168.124.201:8180/LMSLagos");
	    System.out.println("Browser Open");
	}

	@When("^Inside Running$")
	public void inside_Running() throws Throwable {
	    LogIn_Page.txtbx_UserName(driver).sendKeys("bomaster");
	    LogIn_Page.txtbx_Password(driver).sendKeys("12345678");
	    LogIn_Page.btn_LogIn(driver).click();
		 System.out.println("Login SucessFul");
	}

	@Then("^Inside TearDown$")
	public void inside_TearDown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Home_Page.lnk_LogOut(driver).click();
		 System.out.println("Logout Sucess....");
	}



}
