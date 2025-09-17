package day10;

public class EmployeeMain {

	public static void main(String[] args) 
	
	{
		Employee emp1=new Employee();  //object
		emp1.eid=101;
		emp1.ename="John";
		emp1.job="Manager";
		emp1.sal=50000;
		emp1.display();
		
		
		Employee emp2=new Employee();  //object
		emp2.eid=102;
		emp2.ename="David";
		emp2.job="Engineer";
		emp2.sal=30000;
		emp2.display();
	}

}
