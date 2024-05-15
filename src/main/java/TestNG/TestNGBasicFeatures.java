package TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasicFeatures {
	
	@BeforeMethod 
	
	public void openBrowser() {
		
		System.out.println("@BeforeMethod ===========================Open the browser");
		
	}
	
	
	// priority is keyword so mention always in small letter and after the annotation
	//groups fetaure used to execute specific test cases ===>testng.xml
	
	@Test(groups="sanity")
	
public void verifyloginsuccess() {              
		System.out.println("@Test======================verifyloginsuccess");
		
		
	}
	
	@Test ()
	
	public void Verifylogodiaplayed() {                  
		System.out.println("@Test======================Verifylogodiaplayed");
		
		
	}
	
	@Test(priority=-1,groups="sanity")
	
	public void VerifypageTitle() {                             
		System.out.println("@Test======================VerifypageTitle");
		
	
	}
	
	@Test()
	
public void verifyforgotlink() {              
		System.out.println("@Test======================verifyforgotlink");
		
		
	}
	
	@Test(groups="sanity")
	
	public void Verifycreateaccountbutton() {                  
		System.out.println("@Test======================Verifycreateaccountbutton");
		
		
	}
	
	@Test()
	
	public void Verifynoteuderloginbox() {                             
		System.out.println("@Test======================Verifynoteuderloginbox");
		
	
	}
	
	
	
	@AfterMethod 
	
public void closebrowser() {
		
		System.out.println("@AfterMethod========================browser close");
		
	}
	
	

}
