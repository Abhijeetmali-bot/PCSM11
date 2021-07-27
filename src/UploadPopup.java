import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("http://demo.guru99.com/test/upload/");
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	Thread.sleep(2000);
	 	driver.findElement(By.id("file_wraper0")).click();
	 	Thread.sleep(2000);
	 	Runtime r=Runtime.getRuntime();
	 	String path="‪F:/Abhijeet.exe";
	 	r.exec(path);
	}

}
