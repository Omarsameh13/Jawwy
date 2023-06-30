package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Base.Base;

public class homePage extends Base {

	@FindBy(xpath = "//a[@id='jawwy-logo-web']")
	WebElement logo;
	
	public void validate_logo() {
		System.out.println(logo); 
	}
}
