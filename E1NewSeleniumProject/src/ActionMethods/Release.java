package ActionMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Release {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		//to find the element to be clicked and hold
		WebElement elementtoHold = driver.findElement(By.xpath("//div[@id='circle']"));
		
		Actions act = new Actions(driver);				//to create the object of Actions class
		act.clickAndHold(elementtoHold).perform();		//to perform click and hold operations
		Thread.sleep(7000);
		act.release(elementtoHold).perform();
	}

}
