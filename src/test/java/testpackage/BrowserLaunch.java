package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {

	private WebDriver driver;
	
	@Test
	
	public void print()
	{
		System.out.println("About to Launch Google Chrome");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		System.out.println("Launched Google Chrome Successfully!");
	}

}
