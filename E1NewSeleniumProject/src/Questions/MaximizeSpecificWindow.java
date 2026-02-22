package Questions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeSpecificWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/windows");
        
        String parentwindow = driver.getWindowHandle();
        
     // Click to open child window
        driver.findElement(By.linkText("Click Here")).click();
        
        Set<String> allWindows = driver.getWindowHandles();
        
        for(String window : allWindows) {
        	 	driver.switchTo().window(window);
        	 	
        	 	if(driver.getTitle().equals("New Window")) {
        	 		driver.manage().window().maximize();
        	 		System.out.println("child window maximizes");
        	 	}
        	 	
        }
        //driver.switchTo().window(parentwindow);

	}

}
