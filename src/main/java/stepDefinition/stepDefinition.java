package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Screenshot.screenshot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends screenshot {
	

	WebDriver driver;

	@Given("^I Launch the URL$")
	public void launchURL() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.borland.com/gmopost/");  
		driver.manage().window().maximize();
		super.getScreenshots(driver, "Launched URL");
	}
	
	@When ("^I verify the title as \"(.*)\"$")
	public void verifyTitle(String title) throws IOException{
		Assert.assertEquals(title, driver.getTitle());
		super.getScreenshots(driver, "URL Verified");
	}
		
	@And("^I click on EnterGMO Online Button$")
	public void clickEnterGMOOnlineButton() throws IOException{
		driver.findElement(By.xpath("//input[@value='Enter GMO OnLine']")).click();
//		btnEnterGMO.click();
		super.getScreenshots(driver, "Enter GMO Button clicked");
	}
	
	@Then("^I Enter the Quantity for the \"(.*)\" Product as \"(.*)\"$")
	public void entrQuantityfortheProduct(String product, String quantity) throws IOException{
		driver.findElement(By.xpath("//td[text()='"+product+"']//following-sibling::td/h1/input[@type='text']")).sendKeys(quantity);
		super.getScreenshots(driver, "Quantity Entered");
	}
	
	@Then ("^I click on Place an Order Button$")
	public void clickPlaceAnOrder() throws IOException{
		driver.findElement(By.xpath("//input[@value='Place An Order']")).click();
//		btnPlaceAnOrder.click();
		super.getScreenshots(driver, "Place an Order clicked");
	}
	
	@Then ("^I Close the Browser$")
	public void closeBrowser(){
	driver.close();
	}
}


