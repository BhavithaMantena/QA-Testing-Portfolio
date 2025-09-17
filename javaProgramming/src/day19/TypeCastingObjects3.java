package day19;
//A b= (C) d

public class TypeCastingObjects3 {

	public static void main(String[] args) 
	{

		//EX-1
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o;   //Rule1--yes Rule2--yes Rule3--failed
		
		//EX-2
		//String s=new String("welcome");
		//StringBuffer sb=(StringBuffer) s;   //Rule1--failed
		
		//EX-3
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o;   //Rule1--yes Rule2--yes Rule3--failed
		
		//EX-4
		//Object o=new String("welcome");
		//StringBuffer sb=(String) o;   //Rule1--yes Rule2--failed
		
		//EX-5
		//String s=new String("welcome");
		//StringBuffer sb=(String) s;   //Rule1--passed Rule2---failed
		
		
		//EX-6
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o;   //Rule1--yes Rule2--yes Rule3--failed
		
		//EX-7
		Object o=new String("welcome");
		String s=(String) o;   //Rule1--yes Rule2--yes Rule3--yes
		System.out.println(s);


	}

}
