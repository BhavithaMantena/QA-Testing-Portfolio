package day17;

public class DataConversionMethods {

	public static void main(String[] args)
	{
		
		//string --- int
		
		//String s="welcome";    // cannot convert to int
		//int sint=Integer.parseInt(s);  
		
		/*String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));*/
		
		//String-- double
		//String s1="10.5";
		//String s2="20.0";
		//double db=Double.parseDouble(s1)+Double.parseDouble(s2);
		//System.out.println(db);
		
		
		//string ---- boolean
		//String s1="true";
		//System.out.println(Boolean.parseBoolean(s1));
		
		//String s1="welcome";  //other than true if you pass any string that will return the false
		//System.out.println(Boolean.parseBoolean(s1));
		
		
		//primitive to string
		//int byte short long char --- string
		int a=10;
		double d=10.5;
		char ch='A';
		boolean bool=true;
		String s=String.valueOf(a);
		System.out.println(a);
		s=String.valueOf(d);
		System.out.println(s);
		s=String.valueOf(ch);
		System.out.println(s);
		s=String.valueOf(bool);
		System.out.println(s);
		
				
	}

}
