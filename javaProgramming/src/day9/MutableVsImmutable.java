package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) 
	{
		//mutable --- can change
		int a[]= {20,10,40,50,30};
		System.out.println("Before sorting "+Arrays.toString(a));
		Arrays.sort(a); //mutable
		System.out.println("After sorting "+Arrays.toString(a));
		
		
		//immutable
		String s=new String("welcome");
		System.out.println(s);
		String concatstring=s.concat("to java");
		System.out.println(s);  //welcome  --- immutable 
		System.out.println(concatstring);

	}

}
