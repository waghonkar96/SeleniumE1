package Questions;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to close only child browser and not parent browser
public class closeChildwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
     // Step 1: Open application
        driver.get("https://www.naukri.com");
        
        String parentwindow = driver.getWindowHandle();
        System.out.println(parentwindow);
        
        Thread.sleep(5000);
        
        Set<String> allWindowHandles = driver.getWindowHandles();
        
        for(String window : allWindowHandles)
        {
        	if(!window.equals(parentwindow)) {
        		driver.switchTo().window(window);
        		driver.close();
        	}
        }
        driver.switchTo().window(parentwindow);
        System.out.println("Child window closed successfully");
	}

}
