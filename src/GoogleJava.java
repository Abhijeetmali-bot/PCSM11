import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleJava {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
    	Thread.sleep(2000);
    	//List<WebElement> fetch = driver.findElements(By.xpath("//h2/span[contains(.,'Java')]"));
    	List<WebElement> fetch=driver.findElements(By.xpath("//b[text()='script']/parent::span[text()='java']"));
    	for (WebElement webElement : fetch) {
    		System.out.println(webElement.getText());
    		//fetch.get(2).click();
		}
    	Thread.sleep(2000);
    	//fetch.get(2).click();
    	driver.close();	
	}
}
