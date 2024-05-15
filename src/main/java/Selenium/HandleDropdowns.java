package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdowns {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver =new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		// 1 from date dropdown-Days
		
		
		WebElement birthday=driver.findElement(By.id("day"));  // select days dropdown
		
		
		Select day = new Select(birthday);
		
		//day.selectByIndex(0);   // selectByIndex() method used
		
		
		// Select the month from month dropdown- Jan Month
		
		
		WebElement birthmonth=driver.findElement(By.id("month"));
		
		Select month = new Select(birthmonth);
		
		month.selectByVisibleText("Jan");   // selectByVisibleText() method used
		
		
		// Select the year from year dropdown- 1999 year
		
		

		WebElement birthyear=driver.findElement(By.id("year"));
		
		Select year = new Select(birthyear);
		
		 year.selectByValue("1999");    // selectByValue() method used
		 
		 
		 
	// to display all options in dropdown---getOptions method used to select all options in dropdown
		 
		
		 
		 List<WebElement> Alloptions=month.getOptions();
		
	// for each loop	 
		 
//		 for(WebElement option:Alloptions)
//		 {			 
//			 System.out.println(option.getText() );
//		 		 }
//		 
//		 
	// for loop
//		 
//		 for (int i=0; i<Alloptions.size();i++)
//		 {
//			 
//			 System.out.println(Alloptions.get(i).getText());
//			 
//		 }
//		
		 
		 
		 
		 // Without select class methods  We can handle dropdown
		 
		 List <WebElement> Alldates= day.getOptions();
		 
		 
		 for(WebElement date:Alldates)
		 {			 
			 if (date.getText().equals("5")){
				 
				 date.click();
			 }
		 		 }
		 
		 
		
		
		  
	}

}
