import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoCancelButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://demoqa.com/alerts");
	 	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 	Thread.sleep(3000);
	 	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	 	Thread.sleep(2000);
	 	Alert a =driver.switchTo().alert();
	 	Thread.sleep(2000);
	 	System.out.println(a.getText());
	 	a.dismiss();
	 	//a.accept();
	 	Thread.sleep(2000);
	 	WebElement errText = driver.findElement(By.xpath("//span[@id='confirmResult\']"));
	 	//driver.close();
	 	System.out.println(errText.getText());
	}

}
