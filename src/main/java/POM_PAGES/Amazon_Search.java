package POM_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Amazon_Search {
	
	static WebDriver dr;
	
	public Amazon_Search(WebDriver dr) {
		Amazon_Search.dr = dr;
	}
	
	public void search(String item) {
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
		dr.findElement(By.id("nav-search-submit-button")).click();
	}
	
	public void watch_link() {
		String xpath = "//span[@class=\"rush-component s-latency-cf-section\"]/div/div[4]/div/div//div[@class=\"s-image-padding\"]//a";
		dr.findElement(By.xpath(xpath)).click();
	}
	
	public void shoe_link() {
		String xpath = "//span[@class=\"rush-component s-latency-cf-section\"]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]//a";
		dr.findElement(By.xpath(xpath)).click();
	}
	
	public void laptop_link() {
		String xpath = "//span[@class=\"rush-component s-latency-cf-section\"]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div//a";
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
