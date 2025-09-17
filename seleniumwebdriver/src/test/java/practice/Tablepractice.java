package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablepractice {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)find no of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total no of rows: "+rows);
		
		//no of columns in a table
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No of cols:"+cols);
		
		//read data from specific row and column
		String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]")).getText();
		System.out.println(name);
		if(name.equals("Animesh"))
		{
			System.out.println("Tst pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		//4 read data from all rows and columns
		/*for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				String txt=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(txt+"\t");
			}
			System.out.println();
		}*/
		
		for(int r=2; r<=rows; r++) {
			
				String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				if(author.equals("Mukesh"))
				{
					String name1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.println(name1+author);
				}
			
		}
		
		
		int count=0;
		for(int r=2; r<=rows; r++)
		{
			String no=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			count=count+Integer.parseInt(no);
		}
		System.out.println(count);
		
		List<WebElement>row= driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]//td"));
		
		for(int r=0; r<row.size();r++)
		{
			String val=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td")).getText();
			System.out.println(val);
		}
		
		

	}

}
