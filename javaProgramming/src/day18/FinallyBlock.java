package day18;

public class FinallyBlock {

	public static void main(String[] args) 
	{

		String s="welcome";
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("catch block handled exception...");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("you entered finally block");
		}
		
	}

}
