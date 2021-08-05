import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRobotDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement create=driver.findElement(By.xpath("//a[(@data-testid='open-registration-form-button')]"));
	create.click();
	Thread.sleep(2000);
	WebElement day=driver.findElement(By.xpath("//select[(@id='day')]"));
	Select s= new Select(day);
	s.selectByVisibleText("4");
	WebElement month=driver.findElement(By.xpath("//select[(@id='month')]"));
	Select s1=new Select(month);
	s1.selectByValue("10");
	WebElement year=driver.findElement(By.xpath("//select[(@id='year')]"));
	Select s2=new Select(year);
	s2.selectByValue("1997");
	
	List<WebElement> months=s.getOptions();
	for (WebElement mon: months)
	{
		System.out.println(mon.getText());
	}
	WebElement male=driver.findElement(By.xpath("//input[@value='2']"));
	male.click();
	Thread.sleep(2000);
	System.out.println("gender click is : "+ male.isSelected());
	System.out.println(male.getTagName());
	Point loc=male.getLocation();
	System.out.println(loc);
	System.out.println(loc.getX()+ "   "+loc.getY());
	//driver.close();
	
}
}
