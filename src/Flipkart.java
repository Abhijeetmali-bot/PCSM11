import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.flipkart.com/");
	 	driver.manage().window().maximize();
	 	Thread.sleep(3000);
	 	WebElement close=driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2doB4z']"));
	 	close.click();
	 	Actions a=new Actions(driver);//object creation
	 	Thread.sleep(2000);
	 	List<WebElement> Menues =driver.findElements(By.xpath(""));
	}

}
