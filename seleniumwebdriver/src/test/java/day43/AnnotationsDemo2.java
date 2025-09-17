package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*1)Login
 * 2)Search
 * 3)Advanced Search
 * 4)Logout
 */

public class AnnotationsDemo2
{
	@BeforeClass
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test
	void search()
	{
		System.out.println("this is Search");
	}
	
	@Test
	void advancedSearch()
	{
		System.out.println("This is Advanced Search");
	}
	
	@AfterClass
	void Logout()
	{
		System.out.println("This is logout");
	}
}
