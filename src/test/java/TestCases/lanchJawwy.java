package TestCases;

import org.testng.annotations.Test;

import Base.Base;
import Pages.homePage;

public class lanchJawwy extends Base {
	
	@Test(priority = 1)
	public static void goToJawwy() {
		homePage homePage=new homePage();
		homePage.validate_logo();
	}

}
