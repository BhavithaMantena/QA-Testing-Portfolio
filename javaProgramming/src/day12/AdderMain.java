package day12;

public class AdderMain {

	public static void main(String[] args) 
	{

		Adder addobj = new Adder();
		addobj.sum();  //1
		
		addobj.sum(10,20);  //2
		
		addobj.sum(12.45,12);  //4
		
		addobj.sum(1234,34.567);   //3
		
		addobj.sum(10,20,30); //5

	}

}
