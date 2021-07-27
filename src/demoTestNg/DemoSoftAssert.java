package demoTestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert 
{
	@Test
	public void tc()
	{
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("ank", "unk");
		System.out.println("matched");
		sa.assertAll();
	}
}
