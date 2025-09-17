package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///D:/Automation/bootstrap.html");
		driver.manage().window().maximize();
		
		//select single option
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	/*	driver.findElement(By.xpath("//a//span[@class='text']")).click();
		
		//capture all options and find out size
		List<WebElement> values=driver.findElements(By.xpath("//div[@role='listbox']//ul//li"));
		System.out.println(values.size());
		for(WebElement op:values)
		{
			System.out.println(op.getText());
		} */
		
		//select multiple options
		List<WebElement> values=driver.findElements(By.xpath("//div[@role='listbox']//ul//li"));
		for(WebElement op:values)
		{
			if(op.getText().equals("India") || op.getText().equals("UK"))
			{
				op.click();
			}
		}
	}

}
