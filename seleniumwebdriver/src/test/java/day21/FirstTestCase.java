package day21;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
/*
 * Test case
 * --------
 * 1)Launch browser(chrome)
 * 2)Open URL https://demo.nopcommerce.com/
 * 3) Validate title should be "Your Store"
 * 4)Close browser
 */

public class FirstTestCase {

	public static void main(String[] args) 
	{
		//1)Launch browser(chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		//2)Open URL https://demo.nopcommerce.com
		driver.get("https://demo.nopcommerce.com");
		
		// 3) Validate title should be "Your Store"
		String act_title=driver.getTitle();
		System.out.println(act_title);
		/*if(act_title.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	*/	
		//4 close browser
		//driver.close();
		//driver.quit();
		
		
	}

}
