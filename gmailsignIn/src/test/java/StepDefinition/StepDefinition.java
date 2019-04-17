package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginWebElements.loginWebElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().getCookies();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	}

	@When("I fill in {string} with {string}")
	public void i_fill_in_with1(String string, String string2) {
		loginWebElements login =  new loginWebElements(driver);
		login.username.sendKeys("hidanjoniman@gmail.com");
		login.next.click();
	}

	@Then("i fill in {string} with {string}")
	public void i_fill_in_with(String string, String string2) {
		loginWebElements login =  new loginWebElements(driver);
		login.password.sendKeys("123weare");
	
	}

	@Then("I press the login button")
	public void i_press_the_login_button() {
		loginWebElements login =  new loginWebElements(driver);
		login.next2.click();
	}

	@Then("I should be on the user home page")
	public void i_should_be_on_the_user_home_page() {
		String title =driver.getTitle();
		System.out.println("Your page title is " + title);
	  
	}

	@Then("i should see {string}")
	public void i_should_see(String string) {
		loginWebElements login =  new loginWebElements(driver);
		String text =login.welcome.getText();
		System.out.println(text);
		driver.close();
		driver.quit();
		
	}
	

}
