package day11;

public class ConstructorDemo {
	
	int x;int y;
	
	ConstructorDemo()
	{
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a,int b)
	{
		x=a;
		y=b;
	}
	void sum()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		//ConstructorDemo cd=new ConstructorDemo(); //default
		
		ConstructorDemo cd=new ConstructorDemo(10,20);
		cd.sum();
		
	}

}
