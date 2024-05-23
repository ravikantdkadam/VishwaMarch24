package Selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException,IOException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();
		
		
		//implicit wait();
		
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));   // This is best example of method overloading 
	    
	  
	   //PageLoadTimeOut() :
	    
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		
		
		driver.get("https://www.facebook.com/");
		
		
		//driver.findElement(By.linkText("Create new account")).click();
		
		
		// Thread.sleep(2000);                 // wait for 2 sec or else getting synchronization issue 
	     
		//driver.findElement(By.xpath("(//input[@name='sex'] )[1] ")).click();
		
		
		
		// Explicit wait():
		
		
		// expected title : Facebook – log in or sign up
		
	      
        try {
        	
    		 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10)); // Slenium4 
	              wait.until(ExpectedConditions.titleContains("Facebook � log in or sign up"));
	              
	          
        }
        catch (Exception e)
        {
        	
        	System.out.println("Fail the Wait condition ");
        }
        
		
        
        

        //timeoutExeption -If condition is fail
        // Will execute driver.close -if condition satisfied within given duration i.e 10 seconds 
        
			          driver.close();
		
		
		

	}

	

}
