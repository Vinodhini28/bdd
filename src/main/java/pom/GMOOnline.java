package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GMOOnline {

	WebDriver driver;

	@FindBy(xpath="//input[@value='Enter GMO OnLine']")
	WebElement btnEnterGMO;

	@FindBy(xpath = "//input[@value='About The GMO Site']")
	WebElement btnAboutGMO;

	@FindBy(xpath = "//input[@value='Browser Test Page']")
	WebElement btnBrowseTestPage;

	public GMOOnline(WebDriver driver){
		this.driver=driver;     //Blue highlighted driver is declared in this class and brown highlighted driver is parameter value from step definition class
	PageFactory.initElements(driver, this);
	}

	public void clickGMOOnline(){
		btnEnterGMO.click();

	}	
}
