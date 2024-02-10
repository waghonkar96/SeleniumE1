package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();		//to launch the browser
		Thread.sleep(1000);
		driver.manage().window().maximize(); 		//Maximize the browser window;
		Thread.sleep(1000);
		
		Point pixel=new Point(250,600);				//to pass x and y co-ordinates
		driver.manage().window().setPosition(pixel);//to pass the co-ordinates to setPosition method
	}

}
