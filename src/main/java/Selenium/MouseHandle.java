package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();   // open the Firefox browser
		
		
		//driver.get("https://www.facebook.com/");
		
		
		Actions act =new Actions(driver);    // object of actions class
		
		/*  act.moveToElement(driver.findElement(By.xpath("//a[text()='Forgotten password?']"))).click().build().perform();
		
		//MoveToElement Method : This is used to move the mouse pointer to peritcular element 
		//Build(): To combine all multiple actions in a single statement  we are used build method.
		//Perform():  This method used to execute each action.

	     Thread.sleep(2000);
	
		act.moveToElement(driver.findElement(By.name("email"))).click().sendKeys("vishwatech").moveToElement(driver.findElement(By.name("pass"))).click().sendKeys("solutions").build().perform();

		//driver.close();
	*/	
		
		
		
		
		//dragAnddrop()
		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		
//		WebElement capitals=driver.findElement(By.id("box3"));
//		
//		WebElement country=driver.findElement(By.id("box103"));
//		
		//act.dragAndDrop(capitals, country).build().perform();
		
		
		
		
		
		// Without dragAnddrop() we can move the elment from source to destination using 
		
		
	//	act.moveToElement(capitals).clickAndHold().moveToElement(country).release().build().perform();
		
		
			
		//ContextClick Method - To rightclick action on mouse 
		
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
//		WebElement buttton=driver.findElement(By.xpath("//span[text()='right click me']"));
//		
//		act.moveToElement(buttton).contextClick().build().perform();
//		
		
		//DoubleClick Method :
		
		
		WebElement doublebuttton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.moveToElement(doublebuttton).doubleClick().build().perform();
		
	}

}
