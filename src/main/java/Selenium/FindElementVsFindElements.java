package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		
		

		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		// findElement():
		
		/*
		•	This method used to identify single element in webpage and perform action.
		•	Return a single (First)element.
		•	ReturnType:WebElement
		•	Element not Present : NosuchElementException
		
		*/
		
		
		WebElement userid= driver.findElement(By.id("email"));
		
		  userid.sendKeys("Ravikant");
		  
		  
		  
		  // findElements
		 /* •	This method used to identify list of elements in webpage and perform action.
		  •	Returns all element.
		  •	Return Type: List<WebElement>
		  •	Element not Present : Does not throw any exception returns zero element
*/
		  
		
		  
		  List< WebElement> links=  driver.findElements(By.tagName("a"));
		   
		 System.out.println("number of links avialble onn webpage is " +links.size());   // number of links
		 
	 
		 for(int i=0; i<links.size(); i++)
			 
		 {
			System.out.println(links.get(i).getText());     // To get textb of all links 
			 
		 }
		 
		 
		 
	
		
	}

}
