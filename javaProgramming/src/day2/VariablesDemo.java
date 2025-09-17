package day2;

public class VariablesDemo {

	public static void main(String[] args) 
	{
		//int a;   -----Declaration
		//a=100;   ------assignment
		
		//int b; -------Invalid
		//int b=100; ------Invalid
		
		int a=100; //both declaration and assignment
		System.out.println(a);
		
		a=200;
		System.out.println(a);
		
		
		//Approach 1 if all the varibles are of different datatypes
		
		int d=100;
		int b=200;
		int c=300;
		
		
		// approach 2  if all the variables are of same type
		int r,j,k;  //declaration
		r=100;
		k=200;       //assignment 
		j=300;
		
		
		//approach 3 if all the variables are of different data type
		int h=100, n=200, p=300;
		System.out.println("The value of h is:"+h);
		System.out.println("The value of n is:"+n);
		System.out.println("The value of p is:"+p);
		
		System.out.println(h+" "+n+" "+p);
		
	}

}
