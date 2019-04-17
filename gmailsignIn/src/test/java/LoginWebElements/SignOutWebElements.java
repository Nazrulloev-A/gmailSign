package LoginWebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutWebElements {
	
	public SignOutWebElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="span.gb_8a.gbii")
	public WebElement usernameIcon;
	
	@FindBy(linkText="Sign out")
	public WebElement out;

}
