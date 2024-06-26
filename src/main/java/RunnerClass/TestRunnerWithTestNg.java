package RunnerClass;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
features = "src\\main\\java\\Features\\Tagging.feature",    // The path to the feature file is specified by feature options 
		
		glue={"StepDefination"},   // This argument used to provide step definition file location
		
		dryRun=false,      //dryRun compile the feature file and Step Definition 
		
	   monochrome =true , // Display the console outout in readable format 
	   
				//tags= "@SmokeTest and  @RegressionTest",
	   
	       tags= "@SmokeTest",  // Ignore Test case 
				
				
						// Or : either one  both tags are in  "@SmokeTest or  @RegressionTest",
						
						//And : both    "@SmokeTest and  @RegressionTest",
		
		
				//This option is used create different type of Reports 

		plugin = {"pretty", "html:target/cucumber-reports.html"  //This option is used create different type of Reports :html report
}
				

		)


public class TestRunnerWithTestNg extends AbstractTestNGCucumberTests{
	
	
}
