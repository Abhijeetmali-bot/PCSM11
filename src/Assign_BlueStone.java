import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_BlueStone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.bluestone.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	WebElement diamond = driver.findElement(By.xpath("//a[@title='Diamond Rings ']"));
    	diamond.click();
    	
	}

}
