package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src\\test\\resources\\applicationtest\\login.feature",
		
		glue="Step_Defination",
		
		plugin= {"pretty"}
		
		
		
		)

public class login_runner extends AbstractTestNGCucumberTests
{
	
}
		
		
		
		