package day19;

public class TypeCastingConcept {
	
	public static void main(String[] args) 
	{

		//upcasting  -- Converting value from smaller----> larger
		//downcasting --- Converting value from larger ----> smaller
		
		//int --- long
		//float --- double
		
		//upcasting --- automatic --- smaller to larger
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		//float floatvalue=10.5F;
		//double doublevalue=floatvalue;
		
		
		//downcasting--- manually --larger to smaller
		//long longvalue=10000;
		//int intvalue=(int)longvalue;
		
		double doublevalue=125.55;
		float floatvalue=(float)doublevalue;
		System.out.println(floatvalue);
		
		
		
		//Ex-1
		//int i=100;
		//double d=i;  //upcasting
		//System.out.println(d);
		
		
		//Ex-2
		double d=10.5;
		int i=(int)(d);
		System.out.println(i);
		
		
		

	}

}
