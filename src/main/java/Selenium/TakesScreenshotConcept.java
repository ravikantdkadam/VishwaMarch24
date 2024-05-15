package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
		
		
		driver.get("https://www.facebook.com");
		
		 // TakesScreenshot is interface so we need to upcast the driver instance
		
		
	   TakesScreenshot ts = (TakesScreenshot) driver ;                //create TakesScreenshot interface 
		
//	   File src=ts.getScreenshotAs(OutputType.FILE);             // getScreenshotAs() method used to take screenshot
//		
//		
//	   File dest = new File ("D:\\C drive Data 26_06_23\\eclipse-workspace\\VishwaMarch2024\\target\\FullpageScreen.png");	
//	
//	   FileUtils.copyFile(src, dest); // copied file from src to dest
//	
	   
	// take screenshot of portion- this is in selenium 4 only 
  	    /*
 	        WebElement imgportion= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]"));
  	        
  	       File imgsrc= imgportion.getScreenshotAs(OutputType.FILE);
  	       
  	     File imgdest = new File ("D:\\C drive Data 26_06_23\\eclipse-workspace\\VishwaMarch2024\\target\\imgportion.png");
 	    
  	       FileUtils.copyFile(imgsrc, imgdest);
  	       */

	   
	   
  	  // Takescreenshot of element -this is in selenium 4 only 

  			
  			  WebElement Facebookimg= driver.findElement(By.xpath( "/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img"));
  			 
  			  File logosrc=Facebookimg.getScreenshotAs(OutputType.FILE);
  			  
  			   File logodest = new File ("D:\\C drive Data 26_06_23\\eclipse-workspace\\VishwaMarch2024\\target\\elementlogo.png");
  			 
  			  FileUtils.copyFile(logosrc, logodest);
  			 
	

	}

}
