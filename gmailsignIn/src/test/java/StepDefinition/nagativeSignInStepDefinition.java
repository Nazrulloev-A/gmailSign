package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginWebElements.invalidLoginWebElements;
import LoginWebElements.loginWebElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class nagativeSignInStepDefinition {
	
	WebDriver driver;
	
	@Given("user should be on the login page accout")
	public void user_should_be_on_the_login_page_accout() {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	}

	@When("user should enter the invalid {string} hidanjoniman@gmailcom")
	public void user_should_enter_the_invalid_hidanjoniman_gmailcom(String string) {
		loginWebElements login =  new loginWebElements(driver);
		login.username.sendKeys("hidanjoniman@gmailcom");
	}

	@Then("user should click to next button")
	public void user_should_click_to_next_button() {
		loginWebElements login =  new loginWebElements(driver);
		login.next.click();
	}

	@Then("user should the enter the valid email text")
	public void user_should_the_enter_the_valid_email_text() {
		invalidLoginWebElements error = new invalidLoginWebElements(driver);
   
		String Error=error.errorMsg.getText();
		System.out.println(Error);
		driver.close();
		driver.quit();
	}
	
	

}
