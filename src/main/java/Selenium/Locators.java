package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();   // open the Firefox browser 
		
		driver.get("https://www.facebook.com/");
		
		
		// findElement(): method used to find the element on webpage 
	      // sendKeys(): method used to enter the text in field 
	      //clear(); method used to delete the text 
	      

		
		
		//id locator
		
		
		
		
//	   WebElement userid=	driver.findElement(By.id("email"));   // finelement userId 
//	
//	    userid.sendKeys("rvkadam25");   // perform actions using sendkeys 
//	    
//	    userid.clear();
		
		
	    
//	     WebElement password =   driver.findElement(By.id("pass"));
//	     
//	     password.sendKeys("vishwatech@123");
//	     
//	     password.clear();
//	     
//	     
	     
	     // Optimization of code 
		

//	     driver.findElement(By.id("email")).sendKeys("rvkadam25");
//	     driver.findElement(By.id("email")).clear();
//	     
	     
	     
	     
	     //name locator
	     
//		  WebElement userid= driver.findElement(By.name("email"));
//		  userid.sendKeys("Ravikant");
//	     
//	     driver.findElement(By.name("pass")).sendKeys("kadam");
//	     
	     
	     
	     
	     // linkText ()  Locators--------Use this one on priority==>Copy total link text
	     
	   //  driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		//driver.findElement(By.linkText("Create new account")).click();
	     
	     
	    
	     
	     
	     
	     // partialLinkText()  locator =====> copy partial part of linktext
	     
	     
	  
	   //  driver.findElement(By.partialLinkText("Forgotten")).click();
	     
	     
	     
	     // CSS Selector locator ----if element is not able to find by using id,classname or name then we can use css selector 
		
		          // ID=#id 
		          // Classname=.Classname
	     
	     
	     
//		driver.findElement(By.cssSelector("#email")).sendKeys("CSS Selector");
//		
//		
//		driver.findElement(By.cssSelector("#pass")).sendKeys("CSS Selctor pass");
		
//		
		
		
		// tagname 
		
		
		WebElement ele= driver.findElement(By.tagName("button"));
		
		System.out.println(ele.getText());
		
	
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
