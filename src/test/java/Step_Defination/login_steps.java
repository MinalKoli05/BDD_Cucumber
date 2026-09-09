package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		
	    driver = new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	}

	@When("user enters valid user name {string}")
	public void user_enters_valid_user_name(String UN)
	{
	   driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("standard_user");
	   Assert.assertEquals(UN,"standard_user");
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String PSWD) 
	{
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("secret_sauce");
		Assert.assertEquals(PSWD,"secret_sauce");
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
	}

	@Then("user should be navigated to the product page")
	public void user_should_be_navigated_to_the_product_page()
	{
	   String text= driver.findElement(By.xpath("//span[@class='title']")).getText();
	   Assert.assertEquals(text,"Products");
	  
	}
	
	@When("user enters invalid user name {string}")
	public void user_enters_invalid_user_name(String string)
	{
		 driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("Minal");
	}

	@When("user enters invalid password {string}")
	public void user_enters_invalid_password(String string) 
	{
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("Minal@123");
	}

	@Then("user should get error message")
	public void user_should_get_error_message() 
	{
	   String error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	   Assert.assertEquals(error,"Epic sadface: Username and password do not match any user in this service");
	   System.out.println(error); 
	}



	

}
