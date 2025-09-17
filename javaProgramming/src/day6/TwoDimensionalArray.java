package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{

	/*	int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;  */ 
		
		//approach 2
		int a[][]= {
				{100,200},
				{300,400},
				{500,600}
		};
		System.out.println("number of rows"+a.length);
		System.out.println("number of columns"+a[0].length);
		
		//reading single value into array
		System.out.println(a[0][1]);
		
		//2d array
		
		/*for(int i=0; i<=a.length-1; i++)
		{
			for(int c=0; c<=a[i].length-1; c++)
			{
				System.out.println(a[i][c]+" ");
			}
			System.out.println();
		}*/
		
		//enhanced for loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}
		
		

	}

}
