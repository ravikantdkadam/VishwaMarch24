package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest{                                    // This is login Test case

	
	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://www.facebook.com/");
	
		loginPOMClass loginpg =new loginPOMClass(driver);      // create object of POM Class
		
		loginpg.loginfacebook("pune", "pune@1234");
		
		
		loginpg.clickonforgotlink();
		
	
	}

}
