package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramDemo {

	
		public static void main(String[] args) throws InterruptedException {
			

			WebDriverManager.firefoxdriver().setup();

			WebDriver driver =new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
			
			  
			driver.get("https://www.instagram.com/accounts/login");
			
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Sign up")).click();
			
			driver.findElement(By.tagName("input")).sendKeys("8459636027");
			
			driver.findElement(By.name("fullName")).sendKeys("Akshata Santosh Kulkarni");
			
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div[6]/div/label/input")).sendKeys("Akshataved");

			//driver.findElement(By.xpath("//div[1]/input")).sendKeys("vedant@123");
			
			driver.findElement(By.name("password")).sendKeys("abcd");
			
			
		}
		
	


	//html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div[7]/div/label/input

	}


