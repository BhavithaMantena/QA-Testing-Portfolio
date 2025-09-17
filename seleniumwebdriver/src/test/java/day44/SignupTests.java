package day44;

import org.testng.annotations.Test;

public class SignupTests 
{
	
	@Test(priority=1 , groups= {"regression"})
	void SignupbyEmail()
	{
		System.out.println("This is signupbyemail");
	}
	
	
	@Test(priority=2 , groups= {"regression"})
	void SignupbyFacebook()
	{
		System.out.println("This is signupbyfacebook");
	}
	
	@Test(priority=3 , groups= {"regression"})
	void SignupbyTwitter()
	{
		System.out.println("This is signupbytwitter");
	}
}
