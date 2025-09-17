package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{

		System.out.println("program started...");
		System.out.println("program in progress");
		FileInputStream fil=new FileInputStream("c.:\\Text.txt");
		Thread.sleep(5000);
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		
		System.out.println("program finished");
		System.out.println("program exited");

	}

}
