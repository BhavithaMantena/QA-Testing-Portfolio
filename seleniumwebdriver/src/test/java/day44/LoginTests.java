package day44;

import org.testng.annotations.Test;

public class LoginTests 
{
	@Test(priority=1, groups= {"sanity"})
	void loginThroughEmail()
	{
		System.out.println("This is loginthrough email");
	}
	
	
	@Test(priority=2 , groups= {"sanity"})
	void loginThroughFacebook()
	{
		System.out.println("This is loginthroughfacebook");
	}
	
	@Test(priority=3 , groups= {"sanity"})
	void loginThroughTwitter()
	{
		System.out.println("This is loginthroughtwitter");
	}
}
