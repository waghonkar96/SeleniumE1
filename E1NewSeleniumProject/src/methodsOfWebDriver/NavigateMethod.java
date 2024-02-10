package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();				//to launch the browser
		driver.navigate().to("https://www.flipkart.com/");  //to launch web app
		Thread.sleep(2000);									//to navigate forward
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		}

}
