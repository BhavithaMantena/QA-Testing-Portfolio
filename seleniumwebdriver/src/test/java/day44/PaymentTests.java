package day44;

import org.testng.annotations.Test;

public class PaymentTests 
{

	@Test(priority=1 , groups= {"sanity" ,"regression","functional"})
	void paymentinrupees()
	{
		System.out.println("this is paymentinrupees");
	}
	
	@Test(priority=2 , groups= {"sanity" ,"regression","functional"})
	void paymentindollars()
	{
		System.out.println("this is paymentindollars");
	}
}
