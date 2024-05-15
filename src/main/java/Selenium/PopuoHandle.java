package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopuoHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
				
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
		driver.findElement(By.name("proceed")).click();
		
		// To Handle popup we have to use switchTo() Method with alert statement 
		
	   Thread.sleep(2000);
	
	 Alert alert=driver.switchTo().alert();
	 
	System.out.println( alert.getText());   // getText() method used to get text of alert message 
		
		
	alert.accept();      // To click on ok button 
	
	// alert.dismiss();    // To click on dismiss button
	
	
	// promtalert Popup
	
	
	
	driver.get("file:///E:/Testing/March%202024/Automation%20Testing/Selenium/promtalert.html");
	
	driver.findElement(By.tagName("button")).click();
	
	Alert promtalert=driver.switchTo().alert();
	

	promtalert.sendKeys("Vishwatech solutions");   // ssendkeys method used to enter the text on popup 
	
	promtalert.accept();

	//promtalert.dismiss();
		
		
		

	}

}
