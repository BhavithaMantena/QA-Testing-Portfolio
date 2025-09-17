package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpra {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("tshirt");
		
		//xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@id='small-searchterms'][@type='text']")).sendKeys("apple");
		
		//xpath using and operator
	//	driver.findElement(By.xpath("//input[@id='small-searchterms' and @type='text']")).sendKeys("ornge");
		
		//xpath using or operator
		//driver.findElement(By.xpath("//input[@id='small-searchterms' or @type='a']")).sendKeys("cake");
		
		//xpath using contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("india");
		
		driver.findElement(By.xpath("//a[contains(text(),'Computers ']")).sendKeys("guava");

	}

}
