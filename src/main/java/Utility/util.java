package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class util {
	public static WebDriver dr;
	
	public WebDriver Edge_launch(String url) {
		dr = new EdgeDriver();
		dr.manage().window().maximize();
		dr.get(url);
		
		return dr;
	}
}
