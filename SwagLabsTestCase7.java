package silverspin.swaglabs.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabsTestCase7 {

	@Test
	public void loginSwagLabs() 
	{
		// Scenario 7: Verify if user can login to Swag Labs by entering INVALID username but VALID password
		//Launch the Google Chrome browser
		ChromeDriver driver = new ChromeDriver();
				
		//Maximize the Google Chrome browser
		driver.manage().window().maximize();
				
		//Access the Swag Labs website
		driver.get("https://www.saucedemo.com/");
		
		//Locate element and enter an INVALID value in the Username field
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("visual_us3r");
		
		//Locate element and enter a VALID value in the Password field
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("secret_sauce");
		
		//Locate element and click the Login button
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
		//Locate the Error Message element
		WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
		
		//Get the Error Message
		String actualText = errorMsg.getText();
		String expectedText = "Epic sadface: Username and password do not match any user in this service";
		
		//Verify if user was NOT logged in to Swag Labs and an error message was displayed
		if (actualText.equals(expectedText)) 
		{
			System.out.println("Expected error message matches: " + expectedText);
			System.out.println("TEST PASSED!");
		}
		
		else 
		{
			System.out.println("TEST FAILED! Error message does NOT match");
			System.out.println("Expected error message: " + expectedText);
			System.out.println("Actual error message: " + actualText);
		}
		
		//Close the browser
		driver.quit();

	}

}
