package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginWebElements.SignOutWebElements;
import LoginWebElements.loginWebElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class signOutStepDefinition {
	
	WebDriver driver;
	
	@Given("User should be on the login page account")
	public void user_should_be_on_the_login_page_account() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	}

	@When("user should enter the valid {string} hidanjoniman@gmail.com")
	public void user_should_enter_the_valid_hidanjoniman_gmail_com(String string) {
		loginWebElements login =  new loginWebElements(driver);
		login.username.sendKeys("hidanjoniman@gmail.com");
		login.next.click();
		loginWebElements pass = new loginWebElements(driver);
		pass.password.sendKeys("123weare");
		pass.next2.click();
	}


	@Then("user should login seccsefuly")
	public void user_should_login_seccsefuly() {
		String title =driver.getTitle();
		System.out.println("Your page title is " + title);
	}

	

	@Then("user should click on the account icon")
	public void user_should_click_on_the_account_icon() {
		SignOutWebElements out = new SignOutWebElements (driver);
		out.usernameIcon.click();
		out.out.click();
	}

	@Then("user should click to sign in button and user should successfuly signout")
	public void user_should_click_to_sign_in_button_and_user_should_successfuly_signout() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	    driver.quit();
	}


}
