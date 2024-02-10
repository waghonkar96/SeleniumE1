package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();	//toLaunchChromeBrowser
		Thread.sleep(5000);						//to stop the execution for 5 sec
		driver.manage().window().maximize();
		driver.close();							//to close the browser window
		
	}

}
