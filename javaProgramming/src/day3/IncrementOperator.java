package day3;

public class IncrementOperator {

	public static void main(String[] args)
	{
		//case 1
		/*int a=10;
		System.out.println(a);
		
		a++;//a=a+1; 
		System.out.println(a);  */
		
		
		//case2 post increment   first assign next increment
		
		/*int a=10;
		int result=a++;
		
		System.out.println(result);
		System.out.println(a); */
		
		
		//case3:pre increment    first inrement then assignment
		
		int a=10;
		int result=++a;
		
		System.out.println(result);
		System.out.println(a);
		
		
		
	}

}
