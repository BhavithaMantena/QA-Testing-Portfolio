package day11;

public class StudentMain {

	public static void main(String[] args)
	{
		//using object reference variable
		//Student stu=new Student();
		/*stu.sid=101;
		stu.sname="john";
		stu.grad='A';
		stu.printStudentData();*/
		
		//using method
		/*stu.setStudentData(101, "David", 'A');
		stu.printStudentData();*/
		
		//3.using constructor
		Student stu=new Student(101,"john",'A');
		stu.printStudentData();

	}

}
