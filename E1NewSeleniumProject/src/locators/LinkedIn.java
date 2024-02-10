package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/home");
		Thread.sleep(2000);		
		
		WebElement mailbox=driver.findElement(By.id("session_key"));
		mailbox.sendKeys("onkarwagh.777@gmail.com");
		
		WebElement pass=driver.findElement(By.id("session_password"));
		pass.sendKeys("Swaraj@789");
		
		WebElement button1=driver.findElement(By.className("btn-md btn-primary flex-shrink-0 cursor-pointer\r\n"
				+ "            sign-in-form__submit-btn--full-width"));
		button1.click();
	}

}
