package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Superset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.joinsuperset.com/#/s/feed");
		Thread.sleep(2000);
		
		WebElement mailbox=driver.findElement(By.id("email"));
		mailbox.sendKeys("onkarwagh.777@gmail.com");
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Saguru@123");
		
		WebElement button=driver.findElement(By.className("btn btn-primary btn-block"));
		button.click();
		
	}

}
