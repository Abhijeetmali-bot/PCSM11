import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class GoogleSuggetion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.google.com/");
    	driver.manage().window().maximize();
    	WebElement search=driver.findElement(By.name("q"));
    	System.out.println(search.isDisplayed());
    	System.out.println("is Enable : "+search.isEnabled());
        search.sendKeys("java");
    	Thread.sleep(2000);
    	search.clear();
    	Thread.sleep(2000);
    	List<WebElement> suggs =driver.findElements(By.xpath("//ul[(@class='erkvQe')]/li"));
    	for (WebElement sugg : suggs) 
    	{	
    		System.out.println(sugg.getText());
		}
    	suggs.get(2).click();
    	driver.close();
	}

}
