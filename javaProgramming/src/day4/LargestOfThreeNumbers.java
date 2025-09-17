package day4;

public class LargestOfThreeNumbers {

	public static void main(String[] args)
	{
		
		int a=100;
		int b=200;
		int c=300;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest");
		}
		else 
		{
			System.out.println("c is largest");
		}
	}

}
