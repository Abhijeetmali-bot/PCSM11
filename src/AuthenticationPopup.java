import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	 	Thread.sleep(5000);
	 	
	 	
	 	
	}

}
