package AlertHandlings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Nachiket/Desktop/CSR/html/AlertPopups.html");
		
		driver.findElement(By.id("simpleAlertBtn")).click();
		String AlertLabel = driver.switchTo().alert().getText();
		System.out.println(AlertLabel);
		driver.switchTo().alert().accept();

	}

}
