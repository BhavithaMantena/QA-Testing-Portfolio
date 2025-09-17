package day38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaptureScreenshots {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1)full page screenshot
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);   //copy source file to target file
		*/
		
		//2)capture the screenshot of specific section
	/*	WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile=featuredproducts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featuredproducts.png");
		sourcefile.renameTo(targetfile);   //copy source file to target file
		*/
		
		//3)capture the screenshot of webelement
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile.renameTo(targetfile);   //copy source file to target file
		
		driver.quit();
		
		
		

	}

}
