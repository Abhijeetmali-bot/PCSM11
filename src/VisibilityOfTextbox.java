import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityOfTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("file:///C:/Users/Prakash/Pictures/Seleniam%20Class/VisibilityOfTextbox.html");
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 	WebElement ele=driver.findElement(By.id("iamtextbox"));
	 	WebDriverWait ww=new WebDriverWait(driver, 10);
	 	ww.until(ExpectedConditions.visibilityOf(ele));
	 	ele.sendKeys("Ankur");
	}

}
