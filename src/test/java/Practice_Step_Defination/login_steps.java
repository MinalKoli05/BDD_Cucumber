package Practice_Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {
	
	WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page()
	{
	   driver=new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	   driver.manage().window().maximize();
	}

	@When("user enters valid username {string}")
	public void user_enters_valid_username(String UN)
	{
	    driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys(UN);
	}

	@When("user enters valid pswd {string}")
	public void user_enters_valid_pswd(String PSWD)
	{
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys(PSWD);
	}

	@When("user click on the login button")
	public void user_click_on_the_login_button() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
	    Thread.sleep(2000);
	}

	@Then("user should be navigated to the Product page")
	public void user_should_be_navigated_to_the_product_page() 
	{
	   System.out.println("User is on Product page");
	   String text = driver.findElement(By.cssSelector(".title")).getText();
	   Assert.assertEquals(text ,"Products"); 
	}

}
