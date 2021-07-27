package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueStonePom{
		
		@FindBy(name="search_query")
		private WebElement searchBox;
		@FindBy(xpath="//img[@alt='The Felicita Top Open Ring']")
		private WebElement ring;
		@FindBy(id="buy-now")
		private WebElement buynow;
		@FindBy(xpath="//div[@class='formErrorContent']")
		private WebElement error;
		
		public BlueStonePom(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	

}
//it is not complete the code of this program
