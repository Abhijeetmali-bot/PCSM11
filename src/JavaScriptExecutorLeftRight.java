import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorLeftRight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		/*js.executeScript("window.scrollBy(200,0"); //Scroll right
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-200,0)"); //Scroll left
		*/
		
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
		
	
		
	}

}
