package Stepdef;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import POM_PAGES.Amazon;
import Utility.util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1_Steps {
	WebDriver dr;
	util u;
	Amazon amazon;
	
	@io.cucumber.java.Before
	public void Before() {
		u = new util();
		
	}
	
	@Given("the browser and Amazon URL is launched")
	public void the_browser_is_launched() {
		dr = u.chrome_launch("https://amazon.in");
	}
	
	@Then("the page title and URL should be correct")
	public void the_page_title_and_url_should_be_correct() {
	    amazon = new Amazon(dr);
	    assertEquals(amazon.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	    assertEquals(amazon.getURL(), "https://www.amazon.in/");
	}

	@When("I click on \"Today's Deals\"$")
	public void i_click_on() {
	    amazon.Click_Todays_Deals();
	}

	@Then("^the page should contain the title \"Deals\"$")
	public void the_page_should_contain_the_title() {
	    String actual = amazon.Page_Contains_Deals();
	    String expected = "Deals";
	    assertTrue(actual.contains(expected));
	}

	@When("^I click on the first item in \"Today's Deals\"$")
	public void i_click_on_the_first_item_in() {
		amazon.Click_First_Item();
	    
	}

	@Then("the product name should be displayed")
	public void the_product_name_should_be_displayed() {
	    String Expected = "iQOO 15 (Legend, 12GB RAM, 256GB Storage) | Fastest Snapdragon 8 Elite Gen 5 Processor* | Origin OS 6 - Out of The Box* | Samsung 2K M14 Lead OLED Display - First time Ever in Android";
	    assertEquals(amazon.Product1_name(), Expected);
	}

	@When("I navigate back to the Deals page")
	public void i_navigate_back_to_the_deals_page() {
	    
		amazon.navigate_back();
		
	}

	@When("I click on the second item in \"Today's Deals\"$")
	public void i_click_on_the_second_item_in() {
	    amazon.Click_Second_Item();
	}
	
	@Then("the product name should be correctly displayed")
	public void the_product_name_should_be_correctly_displayed() {
		String Expected = "OnePlus Nord CE5 | Massive 7100mAh Battery | MediaTek Dimensity 8350 Apex | Powered by OnePlus AI | 8GB + 128GB | Black Infinity";
		assertEquals(amazon.Product2_name(), Expected);
	}
	
	@Then("I close the browser")
	public void I_close_the_browser() {
		amazon.close();
	}
	
}
