package POM_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.util;

public class Amazon_Search {
	
	WebDriver dr;
	
	public Amazon_Search(WebDriver dr) {
		this.dr = util.dr;
	}
	
	public void search(String item) {
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
		dr.findElement(By.id("nav-search-submit-button")).click();
	}
	
	public void watch_link() {
		String xpath ="//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-4\"]//div[@data-cy=\"title-recipe\"]";
//		String xpath = "//span[@class=\"rush-component s-latency-cf-section\"]/div/div[4]/div/div//div[@class=\"s-image-padding\"]//a";
		dr.findElement(By.xpath(xpath)).click();
	}
	
	public void shoe_link() {
		String xpath = "//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-3\"]//div[@data-cy=\"title-recipe\"]";
		
		//String xpath = "//span[@class=\"rush-component s-latency-cf-section\"]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]//a";
//		String xpath = "//*[@id=\"0fe1a0da-ccea-4a05-848a-b87654cb0cd8\"]/div/div/span/div/div/div[1]/div/span/a/div";
		dr.findElement(By.xpath(xpath)).click();
	}
	
	public void laptop_link() {
		String xpath = "//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-3\"]//div[@class=\"aok-relative\"]";
//		String xpath = "//span[@class=\"rush-component s-latency-cf-section\"]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div//a";
		dr.findElement(By.xpath(xpath)).click();
	}
	
	public String get_Watch_Title() {
		return dr.findElement(By.xpath("//span[@id=\"productTitle\"]")).getText();
	}
	
	public String get_Title() {
		return dr.getTitle();
	}
	
	public void close() {
		dr.quit();
	}
	
}
