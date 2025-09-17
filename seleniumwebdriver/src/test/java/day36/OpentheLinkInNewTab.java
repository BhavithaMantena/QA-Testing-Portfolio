package day36;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		
		//control+registration
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
		
		//Switching to registration window
		List<String> id=new ArrayList(driver.getWindowHandles());
		
		//Registration
		driver.switchTo().window(id.get(1)); //switch to registration page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John");
		
		//Home page
		driver.switchTo().window(id.get(0)); // switch to home page
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");
		
		
		


	}

}
