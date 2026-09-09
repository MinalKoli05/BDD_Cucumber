package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		

features = "src\\test\\resources\\applicationtest\\product.feature",

glue = "Step_Defination",

plugin = {"pretty"}


)



public class product_runner extends AbstractTestNGCucumberTests 
{

}
