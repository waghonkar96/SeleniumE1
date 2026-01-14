package AlertHandlings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrompAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nachiket/Desktop/CSR/html/AlertPopups.html");
		
		WebElement PromptAlert = driver.findElement(By.xpath("//button[@onclick='promptAlert()']"));
		WebElement Resulttext= driver.findElement(By.id("result"));
		PromptAlert.click();
		driver.switchTo().alert().sendKeys("Onkar");
		driver.switchTo().alert().accept();
		System.out.println(Resulttext.getText());
		
		PromptAlert.click();
		driver.switchTo().alert().sendKeys("Onkar");
		driver.switchTo().alert().dismiss();
		System.out.println(Resulttext.getText());

	}

}
