package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class loginPOMClass {
	
static WebDriver driver;
	// @FindBy annotation used from pagefatcory class 
	
		
		@FindBy(id="email") WebElement username;
		
		@FindBy(id="pass") WebElement password ;
		
		@FindBy(xpath="//button[text()='Log in']") WebElement loginbutton;
				
		@FindBy (linkText="Forgotten password?") WebElement forgottenlink;
		
// To initialize the element we use initElements() method of PageFactory class. It takes two arguments
	
		
		public loginPOMClass(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}

//		
//		public void enterusername(String un) {
//			
//			username.sendKeys(un);                             // Sendkeys action perform 
//		}
//		
//		
//		public void enterpass(String pw) {
//			
//			password.sendKeys(pw);                             // Sendkeys action perform 
//		}
//		
//		public void clickloginbutton() {
//			
//			loginbutton.click();                              // Click action perform 
//			
//		}
		
		
		public void loginfacebook(String un, String pw) {
			username.sendKeys(un);
			
			password.sendKeys(pw);
			
			loginbutton.click();
			
		}
		
		
		public void clickonforgotlink() {
			
			forgottenlink.click();                             // Click action perform 
		}

}
