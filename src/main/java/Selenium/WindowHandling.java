package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
	
		driver.findElement(By.id("windowButton")).click();   // to open new winodw 
		
		
		
		String parentWindow = driver.getWindowHandle();   //use to get address of current window ------Return type is string 
		
		
		System.out.println("This is address of parent window "+parentWindow);
		
		
		Set<String> childbrowsers= driver.getWindowHandles();  // use to get the address of main window and all child window -----------Return type is set of string 
		
		   
		System.out.println("This is address of all window "+childbrowsers);
		
		
		int noofbrowsers= childbrowsers.size();      // no of childbrowsers 
		
	
        System.out.println("No of availble windows including parent window "+noofbrowsers);
        
        

		  for (String childwindow :childbrowsers ) {
			  
			  if (!parentWindow.equalsIgnoreCase(childwindow)) 
			  {
			        driver.switchTo().window(childwindow);

			  }
		  }
			  
			  
		  WebElement Childwindowtext=  driver.findElement(By.id("sampleHeading"));
          
		 
		  
		  System.out.println( Childwindowtext.getText());
		 
		  
  
           driver.switchTo().window(parentWindow);         // switch from child winodw to parent window 
   
           
        WebElement newwindowmsg=  driver.findElement(By.id("messageWindowButton"));
        
        
              if(newwindowmsg.isDisplayed()) {
            	  
            	  System.out.println("selenium is on parent window " );
              }
              else {
                  System.out.println("Selenium is on child window ");
              }
   
   
   
   
		  }    
      
	
	     
	
	
	
      
	}


