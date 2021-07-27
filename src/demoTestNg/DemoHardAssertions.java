package demoTestNg;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoHardAssertions 
{
	@Test
	public void tc()
	{
		String ac="Ankur";
		String ex="Ankur";
		Assert.assertEquals(ac, ex);
		System.out.println("hello");
		List<Object> lst1=new ArrayList<Object>();
		lst1.add("alia");
		lst1.add(122);
		lst1.add(65.5);
		lst1.add(true);
		List<Object> lst2=new ArrayList<Object>();
		lst2.add("alia");
		lst2.add(122);
		lst2.add(65.5);
		lst2.add(true);
		Assert.assertEquals(lst1,lst2);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("ank", "unk");
		System.out.println("matched");
		sa.assertAll();
	}
}
