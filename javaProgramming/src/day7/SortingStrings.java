package day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) 
	{
		
		String s[]= {"D","C","B","A"};
		System.out.println("before sorting"+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("after sorting"+Arrays.toString(s));
		
	}

}
