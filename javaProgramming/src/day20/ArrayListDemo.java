package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {


		//1)Declaration of array
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		
		//2)Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//3)size of array list
		System.out.println(mylist.size());  //8
		
		//4)printing arraylist
		System.out.println("Printing data from arraylist"+mylist); //[100, 10.5, welcome, A, true, 100, null, null]
		
		//5)remove element from arraylist
		mylist.remove(5); //Here  is the index of the element
		System.out.println("After removing "+mylist);// [100, 10.5, welcome, A, true, null, null]
		
		
		//insert element in arraylist
		mylist.add(2,"Java");
		System.out.println("After insertion "+mylist); //[100, 10.5, Java, welcome, A, true, null, null]
		
		//modify element in the arraylist(modify/replace/change)
		mylist.set(2,"python");
		System.out.println("After replacing"+mylist);// [100, 10.5, python, welcome, A, true, null, null]
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3)); //welcome
		
		
		//Reading all the elements from arraylist
		for(int i=0; i<mylist.size(); i++ )
		{
			System.out.println(mylist.get(i));
		}
		
		//using for each loop
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		//using iterator
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		

	}

}
