package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertDemo {
	
	// create a object of sSoftAssert class 
	
static WebDriver driver;


SoftAssert soft= new SoftAssert();   // create object of SoftAssert class


@BeforeMethod

public void preconditions() {
	
	
	//System.setProperty("webdriver.Chrome.driver", "D:\\Testing\\Automation Testing\\chromedriver.exe");

	 //driver = new ChromeDriver(); // get() method is used to open the application
WebDriverManager.firefoxdriver().setup();

driver =new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	driver.get("https://www.Google.com/");

}
@Test 

public void titlepageTest() {


String ActualTitle= driver.getTitle();      // Google 

System.out.println("Title of Facebook page is : "+ActualTitle);

soft.assertEquals(ActualTitle, "Google123", "Expected result not match Actual resul");


boolean b= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();  

     soft.assertTrue(b);  // passo
     
     System.out.println("Logo is dispalyed ");
     

// Assert.assertFalse(b);


   WebElement Name= driver.findElement(By.name("q"));
        Name.sendKeys("Vishwatech Solutions");
      
       System.out.println("End of programme ");
       
        soft.assertAll();     //   This is mandatory to mention at the end of each Test method 
}

@Test

public void gmaillinktest() {


boolean link =driver.findElement(By.linkText("Gmail")).isDisplayed();

 
  soft.assertTrue(link);
 
 
 System.out.println("Link is not displayed ");
 
 soft.assertAll();

}

@AfterMethod 
public void teardown() {

driver.quit();
}

}
