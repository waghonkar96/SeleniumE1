package Navigate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class adminLogin {

	WebDriver driver;
	WebDriverWait wait;


	public adminLogin(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}


	public String adminpage()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("EmailAddress"))).sendKeys("bhagyashri.anbhule@sdaemon.co.in");
		//driver.findElement(By.name("EmailAddress")).sendKeys("bhagyashri.anbhule@sdaemon.co.in");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String actualPageTitle = driver.getTitle();
		System.out.println(actualPageTitle);
		return actualPageTitle;
	}

	public void Validate(String actualPageTitle)
	{
		String expectedPageTitle = "Helponyx";
		if(expectedPageTitle.equals(actualPageTitle))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("❌ Title validation FAILED");
			System.out.println("Expected: " + expectedPageTitle);
			System.out.println("Actual  : " + actualPageTitle);
		}	
	}
	public void ComplaintsOverview()
	{

		WebElement complaintDropdown = driver.findElement(By.xpath("//select[@class='shadow-sm form-select form-select-sm']"));
		Select select = new Select(complaintDropdown);
		
		
	}
}
