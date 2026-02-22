package AlertHandlings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = "admin";
		String password = "admin";
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
