package Navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//search selenium in searchbox
		//1. find element
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//vrify element  is displayed or not
		System.out.println("Is searchbox is enabled"+searchBox.isEnabled());
		System.out.println("Is searchbox is displayed"+ searchBox.isDisplayed());
		
		
		searchBox.sendKeys("Selenium",Keys.ENTER);
		
		
	}

}
