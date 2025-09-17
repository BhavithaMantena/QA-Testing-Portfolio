package day11;

public class GreetingsMain {

	public static void main(String[] args)
	{

		Greetings gr=new Greetings();
		gr.m1();    //1
		
		/*String s=gr.m2();
		System.out.println(s);*/
		System.out.println(gr.m2());
		
		
		gr.m3("john"); //3
		String s=gr.m4("john");
		System.out.println(s);

	}

}
