package day22;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		//1)ID Locator
		//WebElement inputbox=driver.findElement(By.id("small-searchterms"));
		//inputbox.sendKeys("phone"); 
		
		
		//2)ClassName Locator
		//driver.findElement(By.className("search-box-text")).sendKeys("laptop");  
		
		//3)Name Locator
		//driver.findElement(By.name("q")).sendKeys("macbook");   
		
		//WebElement logoclass=driver.findElement(By.className("header-logo"));
		//WebElement logo=logoclass.findElement(By.tagName("img"));
		//System.out.println(logo.isDisplayed());
		
		//4)Linked text 
		//driver.findElement(By.linkText("Build your own computer")).click();  
		
		//5)Partial link text
		//WebElement text=driver.findElement(By.partialLinkText("Build your"));
		//text.click();
		
		//5)using tag name
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("total no of images" +images.size());
		
	}

}
