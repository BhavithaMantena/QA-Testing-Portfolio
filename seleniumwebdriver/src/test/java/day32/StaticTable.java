package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StaticTable {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)Find number of rows in a table
		//int rows=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size(); //multiple table
		
		int rows=driver.findElements(By.tagName("tr")).size();  //single table
		//System.out.println("Number of rows: "+rows); 
		
		
		//2)Find number of columns in a table
		
		int cols=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size(); //multiple table
		
		//int cols=driver.findElements(By.tagName("th")).size();  //single table
		//System.out.println("Number of Columns: "+cols); 
		
		//3)Read Data From Specific row and column  (ex 5th row and 1st column
		
		//String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(bookName);
		
		
		//4)Read data from all the rows and columns
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		//5)print bookname whose author is mukesh
		for(int r=2; r<=rows; r++)
		{
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorname.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookname+"\t"+authorname);
			}
		}
		
		//6)Find total prices of all books
		int total=0;
		for(int r=2; r<=rows; r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		
		System.out.println("Total price of the books: "+total);
	}
	
	
	
	

}


