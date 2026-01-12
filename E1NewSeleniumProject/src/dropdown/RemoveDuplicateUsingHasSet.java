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

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/onkar/Desktop/Web%20elements/dropdown.html");
		
		//select methods
		WebElement menuDD = driver.findElement(By.id("menu1"));
		Select s1 = new Select (menuDD);
		s1.selectByIndex(1);
		Thread.sleep(1500);
		s1.selectByValue("v3");
		s1.selectByVisibleText(" misal ");
		
		//deselect
		s1.deselectByIndex(3);
		s1.deselectByValue("v2");
		s1.deselectByVisibleText("dosa");
		
		s1.selectByValue("v3");
		s1.selectByVisibleText(" misal ");
		
		s1.deselectAll();
		
		//getAllSelectedOptions
		for (int j=2; j<=4; j++) {
			s1.selectByIndex(1);
		}
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		for(WebElement we : allSelectedOptions)
		{
			System.out.println("Selected options are: "+we.getText());
		}
		
		//getFirstOptions : it returns list 
		WebElement firstOption = s1.getFirstSelectedOption();
		System.out.println("First selected option is: " + firstOption.getText());
		
		s1.deselectAll();
		
		//getWrappedElement
		WebElement element = s1.getWrappedElement();
		System.out.println(element.getText());
		
		//is multiple : this returns true or false
		System.out.println("this dropdown is multiselect: "+ s1.isMultiple());
		
		//getoptions : it returns list 
		List<WebElement> options =s1.getOptions(); 
		for(int i=0; i < options.size(); i++)
		{
			
			String ops = options.get(i).getText();
			System.out.println(i+" : "+ops);
		}
		
		
		
//		WebElement multiselect = driver.findElement(By.id("menu1"));
//		Select sel = new Select(multiselect);
//		HashSet<String> hs = new HashSet<String>();	
//		List<WebElement> options = sel.getOptions(); //to get the list of all the option
//		
//		for(WebElement we : options)
//		{
//			String textToInsert = we.getText();
//			hs.add(textToInsert);
//			 
//		}
//		for(String t : hs)
//		{
//			System.out.println(t);
//		}
	}

}
