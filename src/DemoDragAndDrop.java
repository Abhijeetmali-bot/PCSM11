import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://jqueryui.com/slider/\r\n");
	 	driver.manage().window().maximize();
	 	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	 	driver.switchTo().frame(frame);
	 	WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
	 	Actions a=new Actions(driver);
	 	a.dragAndDropBy(slider, 50, 0).perform();
	 	
	 	
	}

}
