package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest2 {
	
	
	@Test
	
	   public void preconditionsgoogle() {
		   
		   WebDriverManager.chromedriver().setup();
		   
		   WebDriver driver = new ChromeDriver();
		   
		   
		   driver.get("https://www.Google.com");
			   
		   
		   
	   }


}
