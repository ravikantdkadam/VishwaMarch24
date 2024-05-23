package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomizedXpath {

	public static void main(String[] args) throws Exception {
		
		 //********************* Absolute Xpath*********************
		
		 // we navigate root from parent to immediate child 
		 // we are using single forwad slash 
		// we never recommend use of absolute x path 
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Automation Testing\\chrome-win32\\chromedriver.exe");
		
		
		
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("Vishwatech");
		
		
		
		
		
		//********************* Relative Xpath ()*********************:
			
			// We navigate from root of Parent element to any child .
		//    To achieve relative Xpath we need to use double fwd slash. 
		
		
		//driver.findElement(By.xpath("//div[3]/input")).sendKeys("solutions");


		
		
		//*********************Xpath by attributes*********************:
		
				
		
		//tagname[@attribute='value'];
		
		//input[@name='firstname']
		
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Vishwatech");
		
		
		
		//driver.findElement(By.xpath("//button [@type='submit']")).click();
		
		
		//	*********************Xpath by Contains()*********************:==============>  We are going to use when address of element is getting chaged for every refresh( Dyanamic element)
		
		//	Any element html code contains text .
		//	If we use Xpath by text then entire text need to be mention.
		//	If we use Xpath by contains then few character of text in sequence need to be used  
		
		
		//tagname [contains(@attribute, ’attributevalue’]
		
		//input [contains(@id,'u_0_5_']

		
		//driver.findElement(By.xpath("//button[contains(@id,u_0_5_)]")).click();
	
		
		
		// *********************start-with function *********************
	     
		//tagname[starts-with(@attribute, ’attributevalue’)
		
		//driver.findElement(By.xpath("//button[starts-with(@id,u_0_5_)]")).click();

		
		

	     // *********************ends-with function *********************
	     // tagname[ends-with(@attribute, ’attributevalue’)

	    //  t_0_5_bb
	    //  a_0_5_bb
	    //  f_0_5_bb  */

	      
	     // driver.findElement(By.xpath("// button[ends-with(@id,'0_5_bb')]")).click();

		
		
	      //***************** Xpath By Text*********************
	      
	      //tagname[text()='textValue']
	      
	      //a [text()='Forgotten password?']
	      
	   //  driver.findElement(By.xpath(" //a [text()='Forgotten password?']")).click();	
	     
	     
	     
	     //*********************Xpath By index*********************
	     
	     //input[@name='sex'] )[2]
		
		Thread.sleep(2000);                 // wait for 2 sec or else getting synchronization issue 
	     
		driver.findElement(By.xpath("(//input[@name='sex'] )[1] ")).click();
		
	}

}
