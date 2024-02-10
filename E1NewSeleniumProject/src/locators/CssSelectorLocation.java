package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();				//to launch the browser
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");		 //to launch web browser
		Thread.sleep(2000);
		
		//to find/Locate username textbox and pass the inputs
		WebElement usname=driver.findElement(By.cssSelector("input[aria-label^='Ph']"));
		usname.sendKeys("onkar");
		Thread.sleep(2000);
		
		// to locate password textbox and pass the inputs
		WebElement passwd=driver.findElement(By.cssSelector("input[aria-label$='word']"));
		passwd.sendKeys("456545");
		Thread.sleep(2000);		
		
		//to click on login button
		WebElement btn=driver.findElement(By.cssSelector("button[type*='bm']"));
		btn.click();
	}

}
