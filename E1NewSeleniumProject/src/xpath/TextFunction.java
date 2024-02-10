package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();				//to launch the browser
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=3kd6irrss711l");		 //to launch web browser
		Thread.sleep(2000);
		
		//WebElement loginbutton= driver.findElement(By.xpath("//a[text()='Login']"));
		//loginbutton.click();
		
		WebElement loginbutton1= driver.findElement(By.xpath("//a[.='Login']"));
		loginbutton1.click();
	}

}
