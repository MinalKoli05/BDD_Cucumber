package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class product_steps {
	
	WebDriver driver;
	
	@Given("user is logged to Saucedemo app")
	public void user_is_logged_to_saucedemo_app() throws InterruptedException 
	{
	    driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/inventory.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	    driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
	    driver.findElement(By.cssSelector("#login-button")).click();
	    Thread.sleep(2000);
	}

	@Given("user is on the product page")
	public void user_is_on_the_product_page() throws InterruptedException 
	{
	    String product = driver.findElement(By.cssSelector(".title")).getText();
	    Assert.assertEquals(product,"Products");
	    System.out.println("User is on the product page");
	    Thread.sleep(2000);
	    
	}
	
	@When("user add {string} in the cart")
	public void user_add_in_the_cart(String product) 
	{
	    if(product.equals("Sauce Labs Bolt T-Shirt"))
	    {
	    	driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[3]")).click();
	    }
	}

	@Then("cart should contain {string} item")
	public void cart_should_contain_item(String QuantityOfProducts) throws InterruptedException 
	{
		driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
		String ActualQuantity = driver.findElement(By.cssSelector(".cart_quantity")).getText();
		Assert.assertEquals(ActualQuantity,QuantityOfProducts);
		
		

	}
	@When("user add {string} in the cart from product page")
	public void user_add_in_the_cart_from_product_page(String product) 
	{
	    if(product.equals("Sauce Labs Backpack"))
	    {
	    	driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[1]")).click();
	    }
	    else if(product.equals("Sauce Labs Bike Light"))
	    {
	    	driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[2]")).click();
	    }
	}

	@Then("cart should contains {string} items")
	public void cart_should_contains_items(String QuantityOfItems) 
	{
		String Quantity = driver.findElement(By.xpath("//span[text()='2']")).getText();
		Assert.assertEquals(Quantity,QuantityOfItems);

	}

            
	

}






