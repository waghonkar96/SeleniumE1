package AlertHandlings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nachiket/Desktop/CSR/html/AlertPopups.html");
		
		WebElement ConfirmationAlert = driver.findElement(By.id("confirmAlertBtn"));
		WebElement resultText = driver.findElement(By.id("result"));
		ConfirmationAlert.click();
		driver.switchTo().alert().dismiss();
		System.out.println("dissmiss done");
		System.out.println(resultText.getText());
		
		driver.findElement(By.id("confirmAlertBtn")).click();
		driver.switchTo().alert().accept();
		System.out.println("accept done");
		System.out.println(resultText.getText());
		
	}

}
