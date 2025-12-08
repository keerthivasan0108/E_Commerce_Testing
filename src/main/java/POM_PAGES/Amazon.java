package POM_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon {
	
	static WebDriver dr;
	
	public Amazon(WebDriver dr) {
		Amazon.dr = dr;
	}
	
	public String getTitle() {
		
		return dr.getTitle();
	}
	
	public String getURL() {
		
		return dr.getCurrentUrl();
	}
	
	public void Click_Todays_Deals() {
		dr.findElement(By.linkText("Today's Deals")).click();
	}
	
	public String Page_Contains_Deals() {
		return dr.getTitle();
	}
	
	public void Click_First_Item() {
		String xpath = "//div[contains(@class,\"DesktopDiscountAsinGrid-module__grid_\")]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/a";
		dr.findElement(By.xpath(xpath)).click();
		
	}
	
	public String Product1_name() {
		return dr.findElement(By.xpath("//span[@id=\"productTitle\"]")).getText();
	}
	
	public void navigate_back() {
		dr.navigate().back();
	}
	
	public void Click_Second_Item() {
		String xpath = "//div[contains(@class,\"DesktopDiscountAsinGrid-module__grid_\")]/div/div/div[2]/div[1]/div/div/div[2]/div[2]/div[1]/a";
		dr.findElement(By.xpath(xpath)).click();
	}
	
	public String Product2_name() {
		return dr.findElement(By.xpath("//span[@id=\"productTitle\"]")).getText();
	}
	
	public String get_Title() {
		return dr.getTitle();
	}
	
	public void close() {
		dr.close();
	}
	
}
