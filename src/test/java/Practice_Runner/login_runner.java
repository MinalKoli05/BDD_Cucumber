package Practice_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
	
	features = "src\\test\\resources\\Practice_applicationtest\\login.feature",
			
	glue = "Practice_Step_Defination",
	
	plugin = {"pretty"}
	
	)
	
	public class login_runner extends AbstractTestNGCucumberTests
{
	
	
}
