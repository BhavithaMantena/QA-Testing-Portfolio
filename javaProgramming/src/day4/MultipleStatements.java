package day4;

public class MultipleStatements {

	public static void main(String[] args) 
	{
		
	/*	if(true) //instead of expression we can give a boolean value
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);
		} */
		
	
	//nested if
	if(true)
	{
		if(true)
		{
			System.out.println("abc");
		}
		else 
		{
			System.out.println("xyz");
		}
	}
	else
	{
		System.out.println("123");
	}
	}

}
