package demoTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	@BeforeMethod
	public void bM() {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://www.google.com/");
	 	System.out.println("Before Method");
	}
	@Test
	public void tc_01() throws InterruptedException {
		Thread.sleep(1000);
	 	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	 	System.out.println("TC1");
	}
	@Test
	public void tc_02() throws InterruptedException {
		Thread.sleep(1000);
	 	driver.findElement(By.name("q")).sendKeys("tsetng",Keys.ENTER);
	 	System.out.println("TC2");
	}
	
	@AfterMethod
	public void aM()
	{
		driver.close(); 
		System.out.println("After Method");
	}
}