package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	//WebDriver driver;
	WebDriver driver;
	@Given("^The login URL of Demo workshop$")
	
	public void the_login_URL_of_Demo_workshop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}

	@When("^User Enters \"(.*?)\" as Username$")
	public void user_Enters_as_Username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(arg1);
	}

	@When("^User enters \"(.*?)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Password")).sendKeys(arg1);
	}

	@When("^user clicks on login$")
	public void user_clicks_on_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	@Then("^user is (valid|invalid)$")
	public void user_is_valid(String msg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if (msg.equals("valid"))
		{
			Assert.assertNotNull(driver.findElement(By.linkText("Log out")));
			driver.findElement(By.linkText("Log out")).click();		
		}
		
		if(driver.getTitle().contains("Login"))
			{
				
			}
		else {
			Assert.assertNotNull(driver.findElement(By.linkText("Log out")));
			driver.findElement(By.linkText("Log out")).click();			
		}
	}
}


