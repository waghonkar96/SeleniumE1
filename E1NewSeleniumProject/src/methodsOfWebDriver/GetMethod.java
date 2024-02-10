package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	//toLaunchChromeBrowser
		Thread.sleep(5000);	
		driver.get("https://www.amazon.com/");
	}

}
