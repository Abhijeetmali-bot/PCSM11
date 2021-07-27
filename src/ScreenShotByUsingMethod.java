import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotByUsingMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("http://www.facebook.com/");
	}
	public static void screenShot(WebDriver driver,String name) 
	{
		//this are completed in previous TakeScreenShotDemo
	}
}
