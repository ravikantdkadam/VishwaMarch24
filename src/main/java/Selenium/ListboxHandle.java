package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListboxHandle {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
		
		driver.get("file:///C:/Users/user/Desktop/multiselct.html");
		
		WebElement car=driver.findElement(By.id("cars"));

		Select cars= new Select (car);
	
		
		System.out.println(cars.isMultiple());     // ismultiple() method used to get list with multiple values or not ----True or false 
		
	
		
		
		List <WebElement> allcars=cars.getOptions();	
			
		for(WebElement cartype:allcars) {
			
			if (cartype.getText().equals("Volvo")||cartype.getText().equals("Opel")) {
				
				cartype.click();
						
	
		}
		
		}
		
		
		
		//getFirstSelectedOption method used to select first options
		
		

//		String firstoption=cars.getFirstSelectedOption().getText();
//		
//		System.out.println(firstoption);
			

		
	}}


