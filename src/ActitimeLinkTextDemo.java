import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLinkTextDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://demo.actitime.com/login.do");
	 	driver.manage().window().maximize();
	 	Thread.sleep(2000);
	 	driver.findElement(By.linkText("Forgot your password?"));
	 	Thread.sleep(2000);
	 	driver.findElement(By.partialLinkText("login page")).click();
	 	driver.close();
	 	
	}

}
