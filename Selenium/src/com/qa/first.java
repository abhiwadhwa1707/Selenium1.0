package com.qa;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;


public class first {
	
	static WebDriver driver ;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Abhishek\\Downloads --Software zip files\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Heloo");
		
		TakeScreenshot("Googlepage");
		
		
	}

	
	public static void TakeScreenshot(String FileName) throws IOException{
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("C:/Users/ASUS/eclipse-workspace/Selenium/src/screenshots/"+FileName+".jpg"));
	
	}
}
