package day16;

interface shape
{
	int length=10;  //final and static
	int width=20;   //final and static
	void circle();   //abstract method
	default void square()
	{
		System.out.println("This is square - default method");
	}
	static void rectangle()
	{
		System.out.println("This is rectangle - static method");
	}
	
}

public class InterfaceDemo implements shape
{
	public void circle()
	{
		System.out.println("this is a circle -- abstract method");
	}
	void triangle()
	{
		System.out.println("this is a triangle");
		
	}
	int x=100;
	int y=200;
	public static void main(String[] args) 
	{
		
		//Scenario 1
		//InterfaceDemo idobj=new InterfaceDemo();
		//idobj.circle();  //abstract
		//idobj.square();  //default
		//shape.rectangle();  //static method can directly access from interface
		//idobj.triangle();
		//System.out.println(idobj.x+idobj.y);
		
		//Scenario 2
		shape sh=new InterfaceDemo();
		sh.circle();  //abstract
		sh.square();  //default
		shape.rectangle();  //static method can directly access from interface
		//sh.triangle();   //we cannot access
		System.out.println(shape.length*shape.width); //accessing static variables directly
		//System.out.println(sh.x+sh.y); //we cannot access
		

		

	}

}
