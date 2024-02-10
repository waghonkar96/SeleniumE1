package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		
		WebElement usntextbox=driver.findElement(By.name("email"));
		usntextbox.sendKeys("onkar_96k");
		
		WebElement passtextbox=driver.findElement(By.name("pass"));
		passtextbox.sendKeys("8967453");
		
		WebElement loginbutton=driver.findElement(By.name("login"));
		loginbutton.click();
		}

}
