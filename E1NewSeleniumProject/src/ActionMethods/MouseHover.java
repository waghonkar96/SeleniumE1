package ActionMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		
		 WebElement homeandfurniture = driver.findElement(By.xpath("//div[@aria-label='Home & Furniture']"));
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(homeandfurniture).perform();
		 
	}

}
