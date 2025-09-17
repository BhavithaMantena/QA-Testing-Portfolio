package day43;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionsVSSoftAssertions {
	
	//@Test
	/*void test_hardassertions()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		Assert.assertEquals(1, 2);  //hard assertion
		
		System.out.println("Testing....");
		System.out.println("Testing....");
	}*/

	SoftAssert sa;
	@Test
	void test_softassertions()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		sa=new SoftAssert();
		sa.assertEquals(1, 2);  //soft assertion
		
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		sa.assertAll(); //mandotary
	}

}
