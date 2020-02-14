package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshot.screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.GMOOnline;
import pom.onlineCatalog;

public class stepDefinitionpom {
	WebDriver driver;
	
	@Given("^I Launch the Borland URL in Chrome$")
	public void launchURL() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.borland.com/gmopost/");  
		driver.manage().window().maximize();
		screenshot.getScreenshots(driver, "URL Launched");
	}

	@When ("^I Click on Enter GMO Online Button in GMO Online Page$")
	public void clickEnterGMOOnlineButton() throws IOException{
		GMOOnline gmo = new GMOOnline(driver); 
		gmo.clickGMOOnline();
		screenshot.getScreenshots(driver, "Enter GMO Clicked");
	}
	
	@Then ("^I enter Quantity as \"(.*)\" in Online Catalog Page$")
	public void entrQuantityfortheProduct(String strQuantity) throws IOException{
		onlineCatalog catalog = new onlineCatalog(driver);
		catalog.onlinecatalog(strQuantity);
		screenshot.getScreenshots(driver, "Quantity entered");		
	}
}
