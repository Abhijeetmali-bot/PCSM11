package demoTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataPro {
	@Test(dataProviderClass = demoTestNg.ReadDataProviderDemoExcel.class,dataProvider = "read" )
	public void tc(String user, String pass )throws Exception
	{
		System.out.println(user+"  "+pass);
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass,Keys.ENTER);
	}
}
