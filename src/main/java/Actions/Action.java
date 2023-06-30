package Actions;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base.Base;



public class Action extends Base{


	//click on element.
	public static void click(WebDriver driver, WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	
	//scroll to element in javascript.
	public static void scroll(WebElement element, WebDriver driver) {
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		jsExecutor.executeScript("argument[0].scrollIntoView();", element);
	}
	
	//find element.
	public static boolean findElement(WebElement element) {
		boolean flag=false;
		if (flag) {
			System.out.println("the element is displayed");
			flag=true;
		}else {
			System.out.println("Cann't find an element: "+element);
			flag=false;
		}
		return flag;
	}
	
	//check if an element id displayed.
	public static boolean isDisplayed(WebElement element) {
		boolean flag=false;
		if (flag) {
			flag=element.isDisplayed();
			if (flag==true) {
				System.out.println("the target element is displayed");
			}else {
				System.err.println("cann't find the target element: "+element);
				flag=false;
			}
		}
		return flag;
	}
	
	//set text to an element.
	public static boolean settext(WebElement element, String text) {
		boolean flag=false;
		
		try {
			element.clear();
			element.sendKeys(text);
			flag=true;
		} catch (Exception e) {
			System.out.println("cann't set text becouse the element is not visible: "+ element);
			flag=false;
		}
		return flag;
	}
	
	//select from drop down menu by text.
	public static boolean SelectByText(WebElement element, String text) {
		boolean flag=false;
		try {
			Select select=new Select(element);
			select.selectByVisibleText(text);
			flag=true;
		} catch (Exception e) {
			System.out.println("the target element is not found in the drop down: "+ element);
			flag=false;
		}
		return flag;
	}
	
	//move to element.
	public static boolean MoveToElement(WebElement element, WebDriver driver) {
		boolean flag=false;
		try {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).build().perform();
			flag=true;
		} catch (Exception e) {
			System.out.println("the move to target element cann't be found: "+ element);
			flag=false;
		}
		return flag;
	}
	
	//handle alert.
	public static boolean alert(WebDriver driver) {
		boolean flag=false;
		Alert alert=null;
		try {
			alert=driver.switchTo().alert();
			alert.accept();
			flag=true;
		} catch (Exception e) {
			System.out.println("the alert cann't be handled");
			flag=false;
		}
		return flag;
	}
	
	

}
