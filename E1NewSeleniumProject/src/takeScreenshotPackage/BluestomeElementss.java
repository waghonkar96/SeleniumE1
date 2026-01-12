package takeScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BluestomeElementss {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		
		try {
			 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			 	wait.until(ExpectedConditions.elementToBeClickable(By.id("denyBtn"))).click();
		}
		catch(TimeoutException e) {
			
		}
		//driver.findElement(By.id("denyBtn")).click();
		
		driver.findElement(By.xpath("//a[@title='Coins']")).click();
		System.out.println("clicked on gold coins");
		
		driver.findElement(By.xpath("//*[@id=\"pid_5920\"]/img")).click();
		System.out.println("clicked on 24kt 1 gram coin");
		
		WebElement twenty4kt1gm = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
		System.out.println("img displayed and selected");
		
		
		File src = twenty4kt1gm.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/bluestome24k1gm.png");
		
		FileHandler.copy(src, dest);
		
	}

}
