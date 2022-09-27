package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id= 'nav-logo-sprites']")
	WebElement logo;
	
	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is displayed: " + flag);
		return flag;
	}
		
	}

