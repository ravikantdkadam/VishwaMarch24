//package StepDefination;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginStepDefination {
//	
//	static WebDriver driver;
//	
//	@Given("^User is already on login page$")
//	public void user_is_already_on_login_page() {
//		
//		WebDriverManager.firefoxdriver().setup();
//
//		 driver =new FirefoxDriver();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcart%2Fview.html%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		
//		
//	    
//	}
//
//	@When("^Title of login page is Amazon Sign In$")
//	public void title_of_login_page_is_amazon_sign_in() {
//		
//		String loginpageTitle= driver.getTitle();
//		Assert.assertEquals("Amazon Sign In", loginpageTitle);
//		
//		System.out.println("User is on login page ");
//		
//   
//	}
//	
//	// Regular expression     \" (.*)  \"
//
//	@Then("^Enter the username \"(.*)\"$")
//	public void enter_the_username(String username) {
//		
//		driver.findElement(By.id("ap_email")).sendKeys(username);
//		
//	   
//	}
//
//	@Then("^User clicks on Continue button$")
//	public void user_clicks_on_continue_button() {
//		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	    
//	}
//
//	@Then("^User enter the password \"(.*)\"$")
//	public void user_enter_the_password(String password) {
//		
//		
//		driver.findElement(By.id("ap_password")).sendKeys(password);
//	}
//
//	@Then("^User click on signin Button$")
//	public void user_click_on_signin_button() {
//		driver.findElement(By.id("signInSubmit")).click();
//	    
//	}
//
//	@Then("^user should be avialble on homepage$")
//	public void user_should_avialble_on_homepage() {
//		
//		WebElement logo =driver.findElement(By.id("nav-logo-sprites"));
//		    
//		boolean b =logo.isDisplayed();
//		
//		Assert.assertTrue(b);
//	    
//	}
//
//
//
//
//}
