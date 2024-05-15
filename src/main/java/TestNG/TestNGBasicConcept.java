package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasicConcept {
	
	
	@BeforeClass      //1    execute once in programme 
	
	public void openbrowser() {
		
	      System.out.println("@BeforClass================launch the Browser");
	}
	
	@BeforeMethod                //2  execute with each test cases
	
	public void Openapplication() {
		
		System.out.println("@BeforeMethod ======================Open the application ");		
	}
	
	
	@Test                          //3   test case written with@Test annotation
	
	
public void verifyloginsuccess() {
		
		System.out.println("@Test ======================Verify user able to login succesfully  ");		
	}
	
	
	@Test                          //3
	
	
public void verifyforgotlinkdisplayed() {
		
		System.out.println("@Test ======================Verify user able to see forgot link  ");		
	}
	
	
	@AfterMethod                    //4   execute with each test cases
	
      public void closeapplication() {
		
		System.out.println("@AfterMethod ======================Close the application ");
		
	}
	
	@AfterClass     //5     execute once in programme
	
      public void closebrowser() {
		
		System.out.println("@AfterClass ======================Close the Borwser ");
		
	}
	
	
	
	
	
	
	
	
	
	

}
