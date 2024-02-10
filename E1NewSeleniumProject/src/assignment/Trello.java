package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trello {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://trello.com/home");
		driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("username")).sendKeys("onkarwagh.777@gmail.com");
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
        driver.findElement(By.id("password")).sendKeys("Onkar@123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[text()='WorkSpace']")).click();

		
		Actions act = new Actions(driver);
		
		WebElement sqlSrc = driver.findElement(By.xpath("//a[text()='SQL']"));
		WebElement javaSrc = driver.findElement(By.xpath("//a[text()='JAVA']"));
		WebElement manualtestingSrc = driver.findElement(By.xpath("//a[text()='Manual Testing']"));		
		WebElement apitestingSrc = driver.findElement(By.xpath("//a[text()='API testing']"));	
		WebElement seleniumSrc = driver.findElement(By.xpath("//a[text()='Selenium']"));	
		
		WebElement mockdoneTar = driver.findElement(By.xpath("//h2[text()='Mock done']"));
		WebElement mockscheTar = driver.findElement(By.xpath("//h2[text()='Mock scheduled']"));
		WebElement mockpendTar = driver.findElement(By.xpath("//h2[text()='Mock pending']"));
		
		act.dragAndDrop(sqlSrc, mockdoneTar).perform();
		act.dragAndDrop(javaSrc, mockdoneTar).perform();
		act.dragAndDrop(manualtestingSrc, mockscheTar).perform();
		act.dragAndDrop(apitestingSrc, mockpendTar).perform();
		act.dragAndDrop(seleniumSrc, mockscheTar).perform();
		
		WebElement rc = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		act.contextClick(rc).perform();
		
		List<WebElement> options = driver.findElements(By.xpath("//button[contains(@class,'BppQGb2j7TfyB5')]"));
		
		
		for(int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
	}

}
