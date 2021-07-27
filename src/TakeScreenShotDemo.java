import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("http://www.facebook.com/");
	 	Thread.sleep(2000);
	 	TakesScreenshot ts=(TakesScreenshot) driver;
	 	File ss=ts.getScreenshotAs(OutputType.FILE);
	 	File ssSave=new File("./ScreenShot/facebook1.png");
	 	Files.copy(ss, ssSave);
	 	Thread.sleep(3000);
	}
	public static void screenShot(WebDriver driver,String name) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
	 	File ss=ts.getScreenshotAs(OutputType.FILE);
	 	File ssSave=new File("./ScreenShot/"+ name +".png");
	 	Files.copy(ss, ssSave); 	
	}
}
