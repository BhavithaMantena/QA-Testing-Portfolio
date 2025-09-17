package day7;
import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) 
	{
		
		// EX- 1 
		//int num=10;   //---> Hard coded value
		//System.out.println(num);
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("The number is: "+num);*/
		
		//EX-2
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number " );
		double num=sc.nextDouble();
		System.out.println("The decimal number is "+num);*/
		
		//EX-3
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string " );
		String s=sc.next();
		System.out.println("The String is "+s );
	}

}
