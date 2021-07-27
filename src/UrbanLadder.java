import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.urbanladder.com/");
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	//Thread.sleep(3000);
	 	WebElement close=driver.findElement(By.xpath("//a[@ class = 'close-reveal-modal hide-mobile']"));
	 	close.click();
	 	Actions a=new Actions(driver);//object creation
	 	Thread.sleep(2000);
	 	
	 	List<WebElement> Menues =driver.findElements(By.xpath("//ul [@class='topnav bodytext']/li"));
	 	for (WebElement menuName : Menues) {
	 		String name=menuName.getText();
	 		System.err.println(menuName.getText());
	 		a.moveToElement(menuName).perform();//calling non static method
	 		
	 		Thread.sleep(2000);
	 		TakeScreenShotDemo.screenShot(driver,name);
	 		List<WebElement> subMenues = driver.findElements(
	 				By.xpath("//span[contains(.,'"+ name +"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
	 		
	 		for (WebElement subMenu : subMenues) {
	 			System.out.println(subMenu.getText());
			}
	 		Thread.sleep(1000);
	 	}
	 	driver.close();
	 	
	 	
	 	//WebElement search =driver.findElement(By.xpath(""))	
	 	//driver.findElement(By.xpath("//a[contains(.,' Stores ' )]")).click();
	 	//Thread.sleep(2000);
	 	//WebElement store = driver.findElement(By.xpath("//h3[contains(.,'Hadapsar, Pune')]"));
	 	//Thread.sleep(2000);
	 	//System.out.println(store.getText());
	 	//driver.close();
	}

}
