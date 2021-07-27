import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.SendKeys;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://demo.actitime.com/login.do");
	 	driver.manage().window().maximize();
	 	Thread.sleep(2000);
	 	WebElement user=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	 	WebElement pass=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	 	driver.findElement(By.id("username")).sendKeys(user.getText());
	 	driver.findElement(By.name("pwd")).sendKeys(pass.getText());
	 	WebElement login=driver.findElement(By.id("loginButton"));
	 	System.out.println(login.isDisplayed());
	 	login.click();
	
	}

}
