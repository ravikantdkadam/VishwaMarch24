package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( 
		
		features = "src\\main\\java\\Features\\orderlogin.feature",    // The path to the feature file is specified by feature options 
		
		glue={"StepDefination"},   // This argument used to provide step defination file location
		
		dryRun=true           //dryRun compile the feature file and Step Defination 
		
	

		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}



