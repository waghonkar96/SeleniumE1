package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailSac {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mailsac.com/");
		Thread.sleep(2000);
		
		WebElement mailbox=driver.findElement(By.id("field_a1xtj"));
		mailbox.sendKeys("Samarth");
		
		WebElement button=driver.findElement(By.tagName("button"));
		button.click();

	}

}
