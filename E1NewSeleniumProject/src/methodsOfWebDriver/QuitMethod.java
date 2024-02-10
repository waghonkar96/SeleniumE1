package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();		//to launch the browser
		Thread.sleep(1000);
		driver.manage().window().maximize(); 		//Maximize the browser window;
		Thread.sleep(1000);
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Open a popup window")).click();  //to open a new(child) Browser window
		Thread.sleep(2000);
		
		//driver.close();
		driver.quit();			//to close the parent as well as child browser window
		
	}

}
