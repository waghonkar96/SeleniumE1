package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();		//to launch chrome
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");	//to launch the web app
		Thread.sleep(2000);
		
		WebElement partoflink=driver.findElement(By.partialLinkText("Forgotten"));		//to locate forgotten password link.
		partoflink.click();							//to click on Forgotten Password? link.
	}

}
