package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	
	static Date obj = new Date();
	 static int date = obj.getDate();
	 static int month = obj.getMonth();
	 static int year = obj.getYear();
	 int hours = obj.getHours();
	 int minutes = obj.getMinutes();
	 int seconds = obj.getSeconds();
	
	
	  static String strValue = String.valueOf(date) + String.valueOf(month+1) + String.valueOf(year-100);
	static int i=1;
	public static void getScreenshots(WebDriver driver, String Description) throws IOException{
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File SrcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
//	only DD/MM/YY
		File Destination = new File ("C:\\Users\\DELL\\Desktop\\Screenshots\\BDD_Cucumber\\Demoborland_" + i + "_" + strValue + ".PNG");
		FileUtils.copyFile(SrcFile, Destination);
		i++;
	}

}
