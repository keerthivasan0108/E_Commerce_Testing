package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class util {
	public static WebDriver dr;
	
	public WebDriver chrome_launch(String url) {
		dr = new EdgeDriver();
		dr.get(url);
		dr.manage().window().maximize();
		return dr;
	}
}
