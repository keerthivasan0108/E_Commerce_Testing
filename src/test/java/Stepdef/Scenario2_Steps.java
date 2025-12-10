package Stepdef;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import POM_PAGES.Amazon_Search;
import Utility.util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario2_Steps {
	WebDriver dr;
	util u;
	static Amazon_Search search;
	
	@io.cucumber.java.Before
	public void Before() {
		u = new util();
		
	}
	
	
	@Given("the Amazon URL Should opened")
	public void the_amazon_url_is_opened() {
		
	    dr = u.Edge_launch("https://amazon.in");	    
	    search = new Amazon_Search(dr);
	}

	@When("I search for {string}")
	public void i_search_for(String item) {
	    
	    search.search(item);
	}

	@Then("the first product in the search results should contain {string} in its title")
	public void the_first_product_in_the_search_results_should_contain_in_its_title(String item) {
		
		if(item.equals("Watches")) {
			search.watch_link();
		    
		    String expected = search.get_Watch_Title();
		    String actual = search.get_Title();
		    System.out.println(actual);
		    System.out.println(expected);
		    assertTrue(actual.contains(expected));
		    
		}
		else if(item.equals("Shoes")){
			search.shoe_link();
			
			String expected = search.get_Shoe_Title();
			String actual = search.get_Title();
			System.out.println(actual);
		    System.out.println(expected);
//		    assertEquals(actual, expected);
			assertTrue(actual.contains(expected));
		}
		else {
			search.laptop_link();
			
			String expected = search.get_Laptop_Title();
			String actual = search.get_Title();
			System.out.println(actual);
		    System.out.println(expected);
//		    assertEquals(actual, expected);
			assertTrue(actual.contains(expected));
		}
			
		
	}

	@Then("I close the browser window")
	public void i_close_the_browser_window() {
	    search.close();
	}
}
