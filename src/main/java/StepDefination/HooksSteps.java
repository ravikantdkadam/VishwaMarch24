//package StepDefination;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
//
//public class HooksSteps {
//	static WebDriver driver;
//	
//
//	
//    @Before   // it will execute before each scenario     	// Global Hooks 
//	
//	public void browsersetup() {
//    	WebDriverManager.firefoxdriver().setup();
//
//    	driver =new FirefoxDriver();
//
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    	
//    	driver.get("https://ui.cogmento.com/");		
//		driver.findElement(By.name("email")).sendKeys("Rvkadam25@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Ravikant@25");
//		driver.findElement(By.xpath("//div[text()='Login']")).click();		
//		System.out.println("Open the browser");
//		
//	}
//	       
//    @Before(" @First")   // Tagged Hooks 
//    
//    public void openbrowsewr() {
//    	
//    	System.out.println("This is before method forTagged hooks ");
//    	
//    }
//	 
//    @After("  @First")      // Tagged Hooks 
//    
//    public void Closebrowser() {
//    	
//    	System.out.println("This is After method forTagged hooks ");
//    	
//    }
//    
//    
//	@After   // It will execute after each scenario    // // Global Hooks 
//	
//	public void tear() {
//		
//		
//		driver.quit();
//		System.out.println("Close the browser");
//	}
//	
//	
//	
//
//// added commented code in Before hook 
////@Given("user is on homepage")
////
////
////public void user_is_on_homepage(DataTable logindata) {
////		
////  List<List<String>> crmlogin=logindata.cells();
////	
////	driver.findElement(By.name("email")).sendKeys(crmlogin.get(0).get(0));   // emailID 
////	driver.findElement(By.name("password")).sendKeys(crmlogin.get(0).get(1));   // password 
////    
////    
////	driver.findElement(By.xpath("//div[text()='Login']")).click();
////}
////
//
//
//@When("user move and click on the contact tab")
//public void user_move_and_click_on_the_contact_tab() throws InterruptedException {
//	
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/a/span")).click();
//
//
//	System.out.println("user clicked on contact tab");
//	
//	
//   
//}
//
//@Then("user is on contact page")
//public void user_is_on_contact_page() throws InterruptedException {
//	Thread.sleep(2000);
//	
//	WebElement text= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/span"));
//	
//	Assert.assertTrue(text.isDisplayed());
//	
//	System.out.println("user is on contact page");
//    
//}
//
//@Then("Click on Create button")
//public void click_on_create_button() throws InterruptedException {
//	
//	Thread.sleep(3000);
//	
//	  driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
//}
//
//@Then("Enter the following details and click on save Button")
//public void enter_the_following_details_and_click_on_save_button(DataTable ContactData) {
//	
//	List<List<String>> contactdetails= ContactData.cells();
//	
//	driver.findElement(By.name("first_name")).sendKeys(contactdetails.get(0).get(0));  //first-name= Ravikant 
//	driver.findElement(By.name("middle_name")).sendKeys(contactdetails.get(0).get(1));   // middle-name= diliprao
//	driver.findElement(By.name("last_name")).sendKeys(contactdetails.get(0).get(2));     // Last-name= Kadam
//	driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(contactdetails.get(0).get(3));   //email
//	
//	driver.findElement(By.xpath("//button[@Class='ui linkedin button']")).click();
//	
//    
//}
//
////
////added commented code in Before hook 
////@Given ("user is on dealshomepage")
////
////public void user_is_on_dealshomepage(DataTable dealslogin) {
////
////	List<List<String>> dlogin=dealslogin.cells();
////	
////	driver.findElement(By.name("email")).sendKeys(dlogin.get(0).get(0));   // emailID 
////	driver.findElement(By.name("password")).sendKeys(dlogin.get(0).get(1));   // password 
////    
////    
////	driver.findElement(By.xpath("//div[text()='Login']")).click();
////	
////}
//
//
//@When("userclick on deals tab")
//public void userclick_on_deals_tab() {
//	
//	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[5]/a/span")).click();
//    
//}
//
//@Then("user is on deals page")
//public void user_is_on_deals_page() {
//	
//WebElement Dealstext= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/span"));
//	
//	Assert.assertTrue(Dealstext.isDisplayed());
//	
//	System.out.println("user is on deals page");
//    
//   
//}
//
//@Then("Click on dealsCreate button")
//public void click_on_deals_create_button() throws InterruptedException {
//	
//	Thread.sleep(3000);
//	
//	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/a[3]/button")).click();
//    
//}
//
//@Then("Enter the following deals details and click on save Button")
//public void enter_the_following_deals_details_and_click_on_save_button(DataTable dataTable) {
//	
//	List<List<String>> dealsdeatils= dataTable.cells();
//	
//	driver.findElement(By.name("title")).sendKeys(dealsdeatils.get(0).get(0));
//	driver.findElement(By.name("amount")).sendKeys(dealsdeatils.get(0).get(1));
//	driver.findElement(By.name("probability")).sendKeys(dealsdeatils.get(0).get(2));
//	
//	
//	driver.findElement(By.xpath("//button[@Class='ui linkedin button']")).click();
//    
//}
//
//
//
//	
//	
//	
//
//}
