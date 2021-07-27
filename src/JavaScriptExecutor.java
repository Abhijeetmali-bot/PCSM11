import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.Google.com/");
	 	driver.manage().window().maximize();
	 	WebElement search=driver.findElement(By.name("q"));
	 	System.out.println(search.isDisplayed());
	 	System.out.println("is Enable :" + search.isEnabled());
	 	search.sendKeys("java",Keys.ENTER);
	 	Thread.sleep(2000);
	 	JavascriptExecutor js=(JavascriptExecutor) driver;
	 	/*js.executeScript("window.scrollBy(0,1000)");  //Scroll up
	 	Thread.sleep(3000);
	 	js.executeScript("window.scrollBy(0,-500)");  //scroll up
	 	Thread.sleep(4000);*/
	 	
	 	/*
	 	js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //full scroll down
	 	Thread.sleep(3000);
	 	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)"); //full scroll up
	 	Thread.sleep(2000);
	 	driver.close();
	 	*/
	 	
	 	WebElement ele=driver.findElement(By.xpath("//span"));
	 	js.executeScript("arguments[0].scrollIntoView()",ele);
	 	
	}

}
