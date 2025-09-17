package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
  
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//self - selects the current node
	    String text=driver.findElement(By.xpath("//a[contains(text(),'Wipro')]/self::a")).getText();
		System.out.println("Self : "+text);   
		
		//parent - selects the parent of the current node (always one)
		text=driver.findElement(By.xpath("//a[contains(text(),'Wipro')]/parent::td")).getText();
		System.out.println("Parent : "+text); 
		
	}

}
