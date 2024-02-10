package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
