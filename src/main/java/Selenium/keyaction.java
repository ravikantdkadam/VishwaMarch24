package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyaction {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement email= driver.findElement(By.id("email"));
				email.sendKeys("Ravikant");
		
		Actions action =new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); // select the text in email 
		
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();   // copy the text in email field 
		
		action.keyDown(Keys.TAB).perform();
	
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();  // paste the text in password filed 
		
		

}
}