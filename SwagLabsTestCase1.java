package silverspin.swaglabs.login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabsTestCase1 {

	@Test
	public void loginSwagLabs()
	{
		//Scenario 1: Verify if user can access Swag Labs page
		
		//Launch the Google Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the Google Chrome browser
		driver.manage().window().maximize();
		
		//Access the Swag Labs website
		driver.get("https://www.saucedemo.com/");
		
		//Get the Page Title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		
		//Verify the Page Title if match
		if (actualTitle.equals(expectedTitle)) 
		{
			System.out.println("Page title matches: " + actualTitle);
			System.out.println("TEST PASSED!");
		}
		
		else 
		{
			System.out.println("TEST FAILED!");
			System.out.println("Expected Result: " + expectedTitle);
			System.out.println("Actual Result: " + actualTitle);
		}
		
		//Close the browser
		driver.quit();

	}

}
