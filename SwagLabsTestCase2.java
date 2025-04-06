package silverspin.swaglabs.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabsTestCase2 {
	
	@Test
	public void loginSwagLabs()
	{
		
		// Scenario 2: Verify if user can login to Swag Labs by entering using VALID credentials
		
		//Launch the Google Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the Google Chrome browser
		driver.manage().window().maximize();
		
		//Access the Swag Labs website
		driver.get("https://www.saucedemo.com/");
		
		//Locate element and enter a VALID value in the Username field
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		//Locate element and enter a VALID value in the Password field
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("secret_sauce");
		
		//Locate element and click the Login button
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
		//After successful logged in, locate the Page Title element
		WebElement heading = driver.findElement(By.className("title"));
		
		//Get the Page Title
		String actualTitle = heading.getText();
		String expectedTitle = "Products";
		
		//Verify if user was successfully logged in to Swag Labs account using VALID credentials when the Page Title match 
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Page title matches: " + expectedTitle);
			System.out.println("TEST PASSED! User was successfully logged in");
		}
		
		else 
		{
			System.out.println("TEST FAILED! Page title does NOT match");
			System.out.println("Expected Title: " + expectedTitle);
			System.out.println("Actual Title: " + actualTitle);
		}
		
		//Close the browser
		driver.close();

	}

}
