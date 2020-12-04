package core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static WebDriver driver;
	
	public static void abreNavegador() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    Driver.driver = new ChromeDriver();
	    Driver.driver.manage().window().maximize();
	}
	
	public static void fechaNavegador() {
		Driver.driver.quit();
	}
	
	public static void printScreen(String titulo) throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("evidencia\\"+titulo+".png"));
	}
}
