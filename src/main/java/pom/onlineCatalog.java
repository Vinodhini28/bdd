package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class onlineCatalog {
	
	WebDriver driver;
	
	@FindBy(xpath = "//td[text()='1000']//following-sibling::td/h1/input[@type='text']")
	WebElement txtQuantityTent;
	
	@FindBy(xpath = "//td[text()='1004']//following-sibling::td/h1/input[@type='text']")
	WebElement txtQuantityBoots;
	
	@FindBy(xpath="//input[@value='Place An Order']")
	WebElement btnPlaceAnOrder;	
	
	public onlineCatalog(WebDriver driver){
		this.driver=driver; //Blue highlighted driver is declared in this class and brown highlighted driver is parameter value from step definition class
	PageFactory.initElements(driver, this);
	
	}
	
	public void onlinecatalog(String strQuantity){
		txtQuantityBoots.sendKeys(strQuantity);
		btnPlaceAnOrder.click();
	}

}
