package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions 
{
	@Test
	void test()
	{
		//Assert.assertEquals("xyz", "xyz"); //passed
		//Assert.assertEquals(123, 345); //failed
		
		//Assert.assertEquals("abc", 123); //failed
		//Assert.assertEquals(123, 123);  // passed
		
		//Assert.assertNotEquals(123, 123);  //failed
		
		//Assert.assertNotEquals(123, 345);  //passed
		
		//Assert.assertTrue(false);  //failed 
		//Assert.assertTrue(true);  //passed
		
		//Assert.assertFalse(false);  //passed
		//Assert.assertFalse(true);  //failed
		
		//Assert.assertTrue(1==2);  //failed 
		//Assert.assertTrue(1==1);  //passed
		
		//Assert.assertFalse(1==2);  //passed
		//Assert.assertFalse(1==1);  //failed
		
		Assert.fail();
		
		
	}
}
