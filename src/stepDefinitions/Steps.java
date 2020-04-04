package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("^Open the firefox and start application$")
	public void open_the_firefox_and_start_application()  {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\PEACEHOUSE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.get("https://twitter.com/login");

	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password()  {
		System.out.println("father father");
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully()  {
		System.out.println("my mum is good");
	    
	}

}
