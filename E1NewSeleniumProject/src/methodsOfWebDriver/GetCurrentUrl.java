package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		String geturl=driver.getCurrentUrl();
		System.out.println(geturl);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.close();

	}

}
