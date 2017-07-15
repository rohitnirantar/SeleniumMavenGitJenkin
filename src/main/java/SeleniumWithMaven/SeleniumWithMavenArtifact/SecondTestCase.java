package SeleniumWithMaven.SeleniumWithMavenArtifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondTestCase {
	
	
	@Test
	public void LaunchDemoqa()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Professional\\Selenium Automation\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // Close the driver
        driver.quit();
	}
	
	@Test
	public void LaunchGooglePage()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Professional\\Selenium Automation\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.Google.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Google.com");
 
		//Wait for 5 Sec
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // Close the driver
        driver.quit();
	}
	
	
	
}
