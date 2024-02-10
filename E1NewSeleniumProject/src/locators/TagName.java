package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();				//to launch the browser
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/onkar/Desktop/Web%20elements/Textfield.html"); //to launch web browser
		Thread.sleep(2000);
		
		WebElement textbox=driver.findElement(By.tagName("input"));		//find password textfield on the webpage.
		textbox.sendKeys("manager");				//to pass the input to password textfield.

	}

}
