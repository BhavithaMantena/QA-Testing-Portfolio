package day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		
		//arithmetic operators  +,-,*,/,%
		int a=20,b=10;
		int result=a+b;
		System.out.println("The sum of a and b is:"+result);
		System.out.println("The sum of a and b is:"+(a+b));
		System.out.println("The difference of a and b is:"+(a-b));
		System.out.println("The multiplication of a and b is:"+(a*b));
		System.out.println("The division of a and b is:"+(a/b));
		System.out.println("The modulo division of a and b is:"+(a%b));
		
		//relational/comparision operators <,<=,>,>=,==,!=
		//returns boolean value --true/false
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		b=20;
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		
		boolean resu=a>b;
		System.out.println(resu);
		
		//logical operators  && || !
		//returns boolean value -- true or false
		boolean x=true;
		boolean y=false;
				System.out.println(x&&y);  //false
				System.out.println(x||y);  //true
				System.out.println(!x);    //false
				System.out.println(!y);    //true
		boolean b1=10>20;
		System.out.println(b1); //false
		
		boolean b2=20>10;
		System.out.println(b2); //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		
		System.out.println((10<20) && (20>10));  //true
		
		
		
		
		

}
}

