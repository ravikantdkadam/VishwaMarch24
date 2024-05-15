package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadpopupHandle {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("E:\\Testing\\March 2024\\Automation Testing\\Selenium\\File upload.docx");  // sendkeys() method used to upload the file with address
		
		
		driver.findElement(By.id("terms")).click();  // select checkbox
		
		driver.findElement(By.tagName("button")).click();  // click on the submit file button 
		
		

	}

}
