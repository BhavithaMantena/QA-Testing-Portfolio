package day19;

class parent
{
	String name="john";
	void m1()
	{
		System.out.println("this is m1 from parent");
	}
}

class child extends parent
{
	int id=101;
	void m2()
	{
		System.out.println("this is m2 from child...");
	}
}

public class TypeCastingObjects1 {

	public static void main(String[] args)
	{
		/*child c=new child();
		System.out.println(c.name); //parent
		c.m1(); //parent
		System.out.println(c.id); //child
		c.m2(); //child
		
		parent p=new child();  //upcasting
		System.out.println(p.name); //parent
		p.m1();  //parent
		
		//System.out.println(p.id);  //we cannot access
		//p.m2(); we cannot access 
		 */
		
		
		//downcasting
		parent p=new parent();
		child c=(child)p;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		
		 
	}

}
