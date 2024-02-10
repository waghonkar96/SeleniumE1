package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NerClassNameLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();				//to launch the browser
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/onkar/Desktop/Web%20elements/Textfield.html");
		
		WebElement passTextBox = driver.findElement(By.className("pass"));
		passTextBox.sendKeys("Admin");
	}

}
