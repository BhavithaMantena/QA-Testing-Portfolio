package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) 
	{

		//String s="welcome";
		//String s=new String("welcome");
		//System.out.println(s);
		
		//length() -returns length of a string(number of characters)
		String s ="welcome";
		int l=s.length();
		System.out.println(l); //7
		System.out.println("welcome".length());  //7
		
		//concat()  -joining strings
		String s1="welcome";
		String s2="to java";
		String s3="automation";
		System.out.println(s1+s2);  //welcometo java
		System.out.println(s1.concat(s2)); //welcometo java
		
		System.out.println(s1+s2+s3); //welcometo javaautomation
		System.out.println(s1.concat(s2).concat(s3)); //welcometo javaautomation
		System.out.println(s1.concat(s2+s3)); //welcometo javaautomation
		
		System.out.println("welcome"+"to java"); //welcometo java
		System.out.println("welcome".concat("to java"));  //welcometo java
		
		//trim()-remove spaces right and left side
		s="    welcome    ";
		System.out.println(s);  //print along with spaces
		System.out.println("Before trimming:");
		System.out.println(s.length()); //15
		System.out.println("After trimming:");
		System.out.println(s.trim().length()); //7
		System.out.println(s.trim()); //without spaces
		
		//CharAt()--returns character from a string based on index
		//index starts from zero
		s="welcome";
		System.out.println(s.charAt(0)); //w
		System.out.println(s.charAt(4));  //o
		
		//contains() ---returns true or 
		s="hello welcome to java";
		System.out.println(s.contains("wel"));  //true
		System.out.println(s.contains("to"));  //true
		System.out.println(s.contains("Wel")); //false
		System.out.println(s.contains("welCome")); //false
		
		//equals() equalsIgnoreCase()   ---compare strings
		s1="welcome";
		s2="welcome";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals("Welcome"));  //false
		System.out.println(s1.equalsIgnoreCase("Welcome")); //true
		
		
		//replace()  ----replace single/multiple(sequence) of characters in a string
		s="welcome to selenium java selnium python selenium c#";
		System.out.println(s.replace('e', 'x')); //wxlcomx to sxlxnium java sxlnium python sxlxnium c#
		System.out.println(s.replace("selenium","playwright")); //welcome to playwright java selnium python playwright c#
		s="abcaacc";
		System.out.println(s.replace('a','x').replace('c', 'y'));
		
		//substring() --extracts substring from the main string
		//starting index - 0 
		//ending index - 1
		s="selenium";
		System.out.println(s.substring(1,5)); //elen
		System.out.println(s.substring(0,3)); //sel
		
		
		//toUpperCase() --- 
		s="Welcome";
		System.out.println(s.toUpperCase()); //WELCOME
		System.out.println(s.toLowerCase()); //welcome
		
		//split() ---split the string into multiple parts based on delimeter
		s="abc@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]); //abc
		System.out.println(a[1]); //gmail.com
		System.out.println(Arrays.toString(a)); //[abc, gmail.com]
		
		//ex1
		String amount="$15,20,30";   //exp 152030
		System.out.println(amount.replace("$","")); //15,20,30
		System.out.println(amount.replace("$","").replace(",", "")); //152030
		
		//ex2 
		s="abc,123@xyz"; //abc 123 xyz
		String str1[]=s.split(",");
		System.out.println(Arrays.toString(str1)); //[abc, 123@xyz]
		String str2[]=str1[1].split("@");
		System.out.println(Arrays.toString(str2)); //[123, xyz]
		System.out.println(str1[0]); //abc
		System.out.println(str2[0]); //123
		System.out.println(str2[1]); //xyz
		
		//ex3
		s="abc 123";
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str)); //[abc, 123]
		
		// * % ^ & () you cannot use as delimeters
		
		//ex4
		String name="John Kenedy";
		System.out.println(name.contains("John")); //true
		System.out.println(name.toLowerCase().contains("john"));//true
		System.out.println(name.replace('J','j').contains("john")); //true
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
