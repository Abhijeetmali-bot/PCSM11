import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://demoqa.com/alerts");
	 	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();//it will click first but popup will be show after 5 secs.
	 	Thread.sleep(2000);
	 	WebDriverWait ww=new WebDriverWait(driver, 10);
	 	ww.until(ExpectedConditions.alertIsPresent());
	 	Alert a=driver.switchTo().alert();
	 	a.accept();
	}

}
