package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardactions {

	public static void main(String[] args) {
		

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();   // open the Firefox browser 
		
		driver.get("https://www.facebook.com/");
		
		Actions action =new Actions(driver);
		
		WebElement email=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		
		
		action.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("ravikant").keyUp(Keys.SHIFT).perform();
		
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		action.sendKeys("kadam").perform();
		
		
		//1.SendKeys()perform only 2 actions
		//2.KeyDown()- To handle keyboards buttons-Used to press the keyboard button 
		//3.KeyUp()-To handle keyboards buttons-Used to release pressed keyboard button

		
	
		

	}

}
