package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		searchbox.sendKeys("HP Laptop");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//div[text()='RAM Capacity'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='8 GB']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);

		
		List<WebElement> Lappy = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> LapPrices = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));

		for(int i=0 ;i< Lappy.size();i++)
		{
			String op = Lappy.get(i).getText();
			
			for(int j=i; j<=i; j++)
			{
				String price= LapPrices.get(j).getText();
				System.out.print(op+" : "+price);
				Thread.sleep(1000);

			}
			System.out.println();
			}
		
		

		}
		
	}


	
