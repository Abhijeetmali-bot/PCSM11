import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.Facebook.com/");
	 	driver.manage().window().maximize();
	 	WebElement phno=driver.findElement(By.id("email"));
	 	phno.sendKeys("9172712021");
	    WebElement password=driver.findElement(By.id("pass"));
	    password.sendKeys("Hello");
	    WebElement login=driver.findElement(By.name("login"));
	    login.click();
	}

}
