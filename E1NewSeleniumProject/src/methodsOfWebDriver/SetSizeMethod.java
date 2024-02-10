package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize(); 		//Maximize the browser windoe
		Thread.sleep(1000);
		
		Dimension pixels=new Dimension(650, 400);	//to pass width and hieght to dimension class

		driver.manage().window().setSize(pixels); 	//to pass the dimension to set size

	}

}
