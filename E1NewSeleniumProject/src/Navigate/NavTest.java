package Navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		setup();
		adminLogin login = new adminLogin(driver);
		String Title = login.adminpage();
		
		login.Validate(Title);
	}

	
	String expectedPageTitle = "Helponyx";
	
	public static void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testsupportdesk.sdaemon.com/");
		driver.findElement(By.xpath("//a[contains(@class, 'rounded-full ')]")).click();
		
	}
	
}
