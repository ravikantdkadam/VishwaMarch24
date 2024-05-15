package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrmaeHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		 /*•	By Index:
			•	By Name or ID :
			•	By Web Element
		*/
		

// By WebElement 
		
		
		driver.get("https://demoqa.com/frames");    // Open application 
		
		
		WebElement frame= driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(frame);                                   // switchTo frame by webelement
		
		
		WebElement frmaeText=driver.findElement(By.id("sampleHeading"));
		
		System.out.println(frmaeText.getText());
		
		
		 
		
	// By Name or ID 	
		
	/*
	 * driver.get("https://demo.guru99.com/test/guru99home/");
	 * driver.switchTo().frame("a077aa5e");                          // By ID or name (move to frame from 
	 * browser)
	 * 
	 * System.out.println("Selenium move on frame ");
	 * 
	 * 
	 * Thread.sleep(3000); driver.findElement(By.xpath("/html/body/a/img")).click();
	 */
	 
	
		
		// driver.switchTo().parentFrame();// use to navigate from child frame to immediate parent frame
		// driver.switchTo().defaultContent();  //Use to navigate from any child to main page 
 
		 
		
		
		
		
		
		
	// By index
	 
	/*
	 * driver.get("https://demo.guru99.com/test/guru99home/");
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * int count=driver.findElements(By.tagName("iframe")).size();
	 * 
	 * 
	 * System.out.println("Number of avialble frames on page is :"+count); // Frames
	 * avaialble on webpage
	 * 
	 * driver.switchTo().frame(2); 										 // switchTo frame by index
	 * 
	 * System.out.println("selenium moves to frame");
	 * 
	 */
	}

}	
