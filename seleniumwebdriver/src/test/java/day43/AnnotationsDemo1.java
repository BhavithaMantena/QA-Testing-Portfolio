package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Login
 * Search
 * Logout
 * Login
 * Adv Search
 * Logout
 */

public class AnnotationsDemo1 {
	
	@BeforeMethod
	void Login()
	{
		System.out.println("this is login");
	}
	
	@Test(priority=1)
	void testSearch()
	{
		System.out.println("this is search");
	}
	
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("this is advanced search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("this is logout");
	}

}
