package ActionMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		
		WebElement mobileChargersrc = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement laptopchargersrc = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement MobileCoverSrc = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement LaptopCoverSrc = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement mobileAccTargetLocator = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement LaptopAccTargetLocator = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));

		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(mobileChargersrc, mobileAccTargetLocator).perform();
		act.dragAndDrop(MobileCoverSrc, mobileAccTargetLocator).perform();
		act.dragAndDrop(LaptopCoverSrc, LaptopAccTargetLocator).perform();
		act.dragAndDrop(laptopchargersrc, LaptopAccTargetLocator).perform(); 
		
	}

}
