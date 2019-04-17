package LoginWebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginWebElements {
	
	public loginWebElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="identifierId")
	public WebElement username;
	
	@FindBy(xpath="//span[contains(.,'Next')]")
	public WebElement next;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"passwordNext\"]/content/span")
	public WebElement next2;
	
	@FindBy(xpath="//h1[@class='x7WrMb'][contains(.,'Welcome, Kelog Thanks')]")
	public WebElement welcome;
	
	

}
