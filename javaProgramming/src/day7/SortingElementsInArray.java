package day7;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args)
	{
		int a[]= {100,600,200,400,500};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		/*for(int value:a)
		{
			System.out.println(value);
		}*/
		Arrays.sort(a);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));

	}

}
