package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCRMDemo {
	static WebDriver driver;
	

	
	@BeforeMethod
	
	public void preconditions() {
		
		
		WebDriverManager.firefoxdriver().setup();

		driver =new FirefoxDriver();
		
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.cogmento.com/");
	    
	}
	
	@Test 
	
	public void crmlogin() throws InterruptedException {
		
		driver.findElement(By.name("email")).sendKeys("rvkadam25@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ravikant@25");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		driver.manage().window().maximize();
		
	  Thread.sleep(2000);
	  
	  
	  driver.navigate().to("https://ui.cogmento.com/contacts");
	  
	  driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
//		
//		WebElement conatct= driver.findElement(By.xpath("//a[@href='/contacts']"));
//		
//	
//		Actions action =new Actions(driver);
//	
//	action.moveToElement(conatct).click().build().perform();
		
		
		
	}
	
	
	
	@AfterMethod 
	
	public void closebrowser() {
		
		
	 System.out.println("close the browser");
	}
	

}
