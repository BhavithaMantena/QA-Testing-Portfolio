package day7;

import java.util.Scanner;

public class TakingMultipleInputFromKeyboard {

	public static void main(String[] args) 
	{

		//Addition of two numbers 
		//Example 1
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int num1=sc.nextInt();
		System.out.println("Enter second number ");
		int num2=sc.nextInt();
		System.out.println("The addition of 2 numbers is: "+(num1+num2));*/
		
		//Example 2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name ");
		String s=sc.next();
		System.out.println("My name is: "+s);
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		System.out.println("My age is: "+age);
		System.out.println("Enter unknown value ");
		Object oj=sc.next();
		System.out.println("The value is: "+oj);
		
		
		
		
		
		

	}

}
