package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launchyoutube {

	
public static void main(String[] args) {
	
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\TNT\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().deleteAllCookies();
	}


}
