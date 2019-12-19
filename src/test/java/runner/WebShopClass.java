package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebShopClass {
	
	WebDriver driver;

	@Given("DemoShop website is launched")
	public void demoshop_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.getProperty("http://demowebshop.tricentis.com/");
		System.out.println("Launched");
	}

	@Given("user clicks on register button")
	public void user_clicks_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		System.out.println("User clicks on register");
	}

	@When("user enters the proper data")
	public void user_enters_the_proper_data() {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	
		System.out.println("Fills registration form ");
	}

	@Then("clicks on register button to register")
	public void clicks_on_register_button_to_register() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Clicks on register button");
	}

	@Given("registered user clicks on login link")
	public void registered_user_clicks_on_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Login button");
	}

	@Then("user provides valid data for login input fields")
	public void user_provides_valid_data_for_login_input_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User enters login credentials");
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User on home page");
	}

	@Then("user clicks on search tab")
	public void user_clicks_on_search_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Search tab");
	}

	@Then("user searches for the product")
	public void user_searches_for_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User searches for the product");
	}

	@Given("the search product is available")
	public void the_search_product_is_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("The product is available");
	}

	@Then("user adds in the cart")
	public void user_adds_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Adds in cart");
	}

}
