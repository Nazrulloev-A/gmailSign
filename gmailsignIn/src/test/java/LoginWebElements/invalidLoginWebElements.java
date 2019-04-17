package LoginWebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invalidLoginWebElements {

	public invalidLoginWebElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=" //div[@class='GQ8Pzc']")
	public WebElement errorMsg;
}


