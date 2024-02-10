package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();				//to launch the browser
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");		 //to launch web browser
		Thread.sleep(2000);
		
		//WebElement signin=driver.findElement(By.partialLinkText("Sign In"));
		//signin.click();
		//Thread.sleep(5000);
		
		WebElement usn=driver.findElement(By.xpath("//input[@name='emailId']"));
		usn.sendKeys("onkarwagh.777@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='mui-2']"));
		pass.sendKeys("Ishwari@789");
		
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();		
		

	}

}
