package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTest {
	

	static WebDriver driver;
	
	@BeforeMethod
	
	public void preconditions() {
	
	WebDriverManager.firefoxdriver().setup();

	driver =new FirefoxDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.facbook.com");
	
	}
	
	
	@Test
	
	// assertEquals------> Pass TC if both conditions are equal
	
	//asserNotEquals -----> Pass TC if both conditions are not equals 
	
	public void verifyPageTitle() {
		
		String PageTitle=driver.getTitle();   // actual result :
		
		System.out.println("The facebookl page Title is "+PageTitle);
		
		
		Assert.assertEquals(PageTitle, "Facebook – log in or sign up","TC Failed due expected not match with actual");
		
		//Assert.assertNotEquals(PageTitle, "Facebook – log in or sign up","TC Failed due expected match with actual");
		
	}
	
	
	@Test
	
	// assertTrue: TC  pass if condition is true 
	//assertFalse:  TC passed when condition is getting failed 
	
	public void verifylogo() {
		
		WebElement img = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img"));  // facebook image 
		
		boolean b=img.isDisplayed();
		
	  Assert.assertTrue(b);   // TC pass if img is displayed
	   
	  // Assert.assertFalse(b);  // TC pass if conditions getting failed 
		
	}
	
	
	
	
	@Test 
	
	//assertNull():TC pass when result is null
	//assertNotNull(): TC passed when result is notnull	
	public void assertnull() {
	
		//1st verification 
		
		String PageTitle=driver.getTitle();   // actual result :
		
		Assert.assertNull(PageTitle);   // TC failed because pageTitle is not null 
		
		//Assert.assertNotNull(PageTitle);   // TC pass when condition has some charcters 
		
	
	 // 2nd verification 	
		
		WebElement img = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img"));  // facebook image 
		
		boolean b=img.isDisplayed();
		
	  Assert.assertTrue(b);   // TC pass if img is displayed
		
		System.out.println("2nd condition is run ");
		
		
	
		
	}
	
	
	
	
	@AfterMethod 
	
	public void closebrowser() {
		
		driver.close();
	}
	
	
	
	

}
