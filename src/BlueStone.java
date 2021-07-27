import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.bluestone.com/");
	 	driver.manage().window().maximize();
	 	Thread.sleep(3000);
	    WebElement ring=driver.findElement(By.xpath("//div[@class = 'gms-banner-inner']"));
	    ring.click();
	}

}
