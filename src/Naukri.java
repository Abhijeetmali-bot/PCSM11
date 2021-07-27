import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
 public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
 	WebDriver driver=new ChromeDriver();
 	driver.navigate().to("https://www.Naukri.com/");
 	driver.manage().window().maximize();
 	Thread.sleep(2000);
 	String parent=driver.getWindowHandle();
 	System.out.println("Hello    "+parent);
 	Set<String> wins=driver.getWindowHandles();
 	wins.remove(parent);
 	for(String Abhijeet :wins) {
 		System.out.println(Abhijeet);
 		driver.switchTo().window(Abhijeet);
 		driver.close();
 		Thread.sleep(2000);
 	}
}
}
