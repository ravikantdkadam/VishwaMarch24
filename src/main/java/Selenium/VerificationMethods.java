package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationMethods {

	public static void main(String[] args) {
		
		
		// isEnabled() : This method is used to verify element is enabled  and it return True value .If element is not enable then return False value .
		
		

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		
		/*
		 * driver.get("https://demoqa.com/browser-windows");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * 
		 * WebElement windowbutton=driver.findElement(By.id("windowButton"));
		 * 
		 * System.out.println(windowbutton.isEnabled());
		 */
		
		
	//	isSelected () : This method used on radio buttons ,checkbox or options in a menu . Used to determine element is selected or not. If selected return value True if not selected return value is False.
		
/*
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
	
	WebElement malebutton=driver.findElement(By.xpath("(//input[@name='sex'] )[2]"));
	
		malebutton.click();
		
		
		if (malebutton.isSelected()) {
			
			System.out.println("Button is selected ");
		}
		
		
		else {
			
			System.out.println("Button is not selected ");
		}
	 	
		
	
		}*/

   //isDisplayed(): To check or verify the element is present and displayed. If displayed return value True if not displayed return value is False .

// Verify  whether the logo  is displayed  or not which is present in FB webpage 
		 
		
		
		driver.get("https://www.facebook.com/");
		
	WebElement logo =driver.findElement(By.xpath("//img[@alt='Facebook']"));
	
	if (logo.isDisplayed()) {
		
		System.out.println("Logo is displayed");
	}
	else {		
		System.out.println("logo is not displayed ");
	}
		

		
	}	
		
	}


