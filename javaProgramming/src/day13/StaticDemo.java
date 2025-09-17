package day13;

public class StaticDemo {

	static int a=10;  //Static Variable
	int b=20;  //non-static variable
	
	static void m1()  //static method
	{
		System.out.println("This is m1 static method.....");
	}
	
	void m2()  //non-static method
	{
		System.out.println("This is m2 non-static method.....");
	}
	
	void m()  //non-static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	public static void main(String[] args) 
	{
		//static methods can access static stuff directly (without object)
		//System.out.println(a);
		//m1();
		
		//System.out.println(b); ---- cannot access b is non-static variable
		//m2(); cannot access m2() is non-static
		
		
		//Static methods can access non-static stuff through objects
		
		//StaticDemo sd=new StaticDemo();
		//System.out.println(sd.b);
		//sd.m2();
		//sd.m();
	}

}
