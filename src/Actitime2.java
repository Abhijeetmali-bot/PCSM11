import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime2 {

	public static void main(String[] args) throws Exception {
		// for read the data from excel file in actitime website.
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://demo.actitime.com/login.do");
	 	Thread.sleep(1000);
	 	String user=ReadDataFromExcelFile.readCell("F:/Book1.xlsx", "sheet1", 1, 0);
	 	String pass=ReadDataFromExcelFile.readCell("F:/Book1.xlsx", "sheet1", 1, 1);
	 	driver.findElement(By.id("username")).sendKeys(user);
	 	driver.findElement(By.name("pwd")).sendKeys(pass,Keys.ENTER);
	 	
	}

}
