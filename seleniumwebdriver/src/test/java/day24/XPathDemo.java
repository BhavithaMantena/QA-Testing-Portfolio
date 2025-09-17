package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args)
	{


		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		
		//XPath with single attribute
		//driver.findElement(By.xpath("//input[@class='search-box-text']")).sendKeys("Macbook");
		
		//using abs xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/form[1]/input[1]")).sendKeys("mobile");
		
		
		//Xpath with multiple attributes
		//driver.findElement(By.xpath("//*[@class='search-box-text'][@id='small-searchterms']")).sendKeys("Monitor");
				
		//XPath with 'and' operator
		//driver.findElement(By.xpath("//*[@name='q'and @id='small-searchterms']")).sendKeys("phone");
		
		//XPath with 'or' operator
		//driver.findElement(By.xpath("//*[@name='q'or @id='xyz']")).sendKeys("phone");
				
				
		//XPath with text()
		//driver.findElement(By.xpath("//a[text()='Computers ']")).click();
		
		//boolean displayStatus=driver.findElement(By.xpath("//a[text()='Computers ']")).isDisplayed();	
		//System.out.println(displayStatus);
		
		//--String value=driver.findElement(By.xpath("\\h2[text()='Welcome to our store']")).getText();
		//System.out.println(value);
		
				
		//XPath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'sto')]")).sendKeys("T-shirts");
				
		//XPath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
				
		//chained xpath
		boolean status=driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();
		System.out.println(status);
		
		
		
		
	}

}
