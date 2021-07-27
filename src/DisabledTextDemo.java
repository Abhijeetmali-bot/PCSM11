import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisabledTextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("file:///C:/Users/Prakash/Pictures/Seleniam%20Class/DisabledText.html");
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	 	WebDriverWait ww=new WebDriverWait(driver, 10);
	 	ww.until(new ExpectedCondition<Boolean>(){

			@Override
			public Boolean apply(WebDriver driver) {
				//If the 2nd button is not enabled then it is not working properly program.
				return driver.findElement(By.id("xyz")).isEnabled();
			}
		});
	 	driver.findElement(By.id("xyz")).sendKeys("Abhijeet");
	}
}
