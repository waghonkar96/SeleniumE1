package ActionMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
		WebElement bt1 = driver.findElement(By.id("btn30"));
		WebElement btn2 = driver.findElement(By.id("btn31"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(bt1).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
	}

}
