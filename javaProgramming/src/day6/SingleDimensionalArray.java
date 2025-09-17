package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) 
	{

		//Approach 1
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//approach 2
		//int a[]= {100,200,300,400,500}
		
		//find length of the array
	/*	int s[]= {100,200,300};
		System.out.println(s.length);
		System.out.println(s[3]); */
		
		//read multiple values from array using normal for loop
		/*int a[]= {100,200,300,400,500};
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}*/
		
		//using enhanced for loop
		int a[]= {100,200,300,400,500};
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
