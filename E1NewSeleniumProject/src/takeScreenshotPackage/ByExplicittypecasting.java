package takeScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class ByExplicittypecasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/google.png");
		
		//Files.copy(scr, dest);
		
		//OR
		
		FileHandler.copy(scr, dest);
		//FileHandler.delete(dest);

	}

}
