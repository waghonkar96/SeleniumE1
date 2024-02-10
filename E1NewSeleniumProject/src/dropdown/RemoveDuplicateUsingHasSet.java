package dropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingHasSet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/onkar/Desktop/Web%20elements/dropdown.html");
		
		WebElement multiselect = driver.findElement(By.id("menu1"));
		
		
		Select sel = new Select(multiselect);
		
		HashSet<String> hs = new HashSet<String>();
		
		List<WebElement> options = sel.getOptions(); //to get the list of all the option
		
		for(WebElement we : options)
		{
			String textToInsert = we.getText();
			hs.add(textToInsert);
			 
		}
		for(String t : hs)
		{
			System.out.println(t);
		}
	}

}
