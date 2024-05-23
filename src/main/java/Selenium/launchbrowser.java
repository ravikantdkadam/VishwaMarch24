package Selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {

		
		public static void main(String[] args) {
			

			//System.setProperty("webdriver.Chrome.driver","D:\\Testing\\Automation Testing\\chromedriver.exe");
			
		//System.setProperty("webdriver.gecko.driver", "D:\\Testing\\Firfox driver\\geckodriver.exe");
			
		
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver = new FirefoxDriver();   // object creation
				
//			driver.get("https://www.facebook.com/");     // get method used to launch the application 
//			
//	        
//			driver.manage().window().maximize();   // maximize()  Method is used to maximize the window 
//			
//			driver.manage().window().minimize();  // Minimize()  Method is used to Minimize the window
//			
//	
//			System.out.println("Title of facebook page is "+driver.getTitle());  //getTitle() method is used to find title of webpage 
//			
//			System.out.println("Current url of page is "+driver.getCurrentUrl());  // To get current URL of webpage
//			
			
			
			
			
			//Navigate() Method :This method is used to open an application, move forward, move backward and refresh browser



			driver.navigate().to("https://www.facebook.com/");   // navigate().to(): method used to launch the application 
			
//
//		      driver.navigate().forward();                // move forward
//		      
//		      driver.navigate().to("https://www.amazon.in/");
//		  
//  
//		      driver.navigate().back();                   // move back
//		      
//		      driver.navigate().refresh();              // used to refresh the page 
//		      
//		      
		      // methods to close the browser 
		      
		      
		    //  driver.close();         // close method used to close the current browser 
		      
		    //  driver.quit();        // to close all browser open by selenium 
		      
		      
		      
		        
		        // SetSize(): Browser size change and SetPosition() :position of browser change 
		        
		      
		      Dimension d1 =new Dimension (200,400);
		         
		        driver.manage().window().setSize(d1);   // SetSize

         
		         Point p=new Point(200,300);
		         
		      driver.manage().window().setPosition(p);  // SetPostion


		
	}

}
