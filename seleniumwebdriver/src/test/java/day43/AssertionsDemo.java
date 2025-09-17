package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo 
{
	@Test
	void testTitle()
	{
		String act_title="Opencart";
		String exp_title="Openshop";
		/*if(exp_title.equals(act_title))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		*/
		
		//Assert.assertEquals(act_title, exp_title);
		if(exp_title.equals(act_title))
		{
			System.out.println("Test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test failed");
			Assert.assertTrue(false);
		}
		
		
	}
}
