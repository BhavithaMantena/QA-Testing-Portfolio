package day18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args)
	{
 
		//Example--1
		/*System.out.println("program is started...");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(100/num);   //ArithmeticException
		System.out.println("program is completed");
		System.out.println("program is exited");
		
		
		//Example ---2
		int a[]=new int[5];
		System.out.println("Enter the position(0-4):");
		int pos=sc.nextInt();
		System.out.println("Enter a value");
		int value=sc.nextInt();
		a[pos]=value;  //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);*/
		
		
		
		//Example ---3
		/*String s="welcome";   //NumberFormatException
		int num1=Integer.parseInt(s);
		System.out.println(num1);
		System.out.println("program is completed");
		System.out.println("program is exited");*/
		
		//Example --4 null unknown value
		String s=null;   //NullPointerException
		System.out.println(s.length());
		
		
	}

}
