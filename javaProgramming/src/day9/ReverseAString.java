package day9;

public class ReverseAString {

	public static void main(String[] args) 
	{
		//Approach 1 -- length() charAt()
		String s="welcome";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("the reverse string is "+rev);
		
		
		//Approach 2 --  //without using string methods by converting string to char array type
		String s1="welcome";
		String rev1="";
		char c[]=s1.toCharArray();
		for(int i=c.length-1; i>=0; i--)
		{
			rev1=rev1+c[i];
		}
		System.out.println("the reverse string is "+rev1);
		
		
		//Approach 3 --using StringBuffer Class
		StringBuffer x=new StringBuffer("welcome");
		System.out.println("Reverse String is: "+x.reverse());
		
		//Approach 4 --using StringBuilder Class
		StringBuilder z=new StringBuilder("welcome");
		System.out.println("Reverse String is: "+z.reverse());
		
		
	}

}
