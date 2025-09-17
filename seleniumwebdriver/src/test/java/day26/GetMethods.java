package day26;

import java.util.Set;
import java.lang.Thread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		
		//get(url)- opens the url of the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		
		
		//getTitle()  - returns title of the page
		System.out.println(driver.getTitle()); //OrangeHRM
		
		
		//getCurrentUrl()--returnsURL of the page.
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		
		//getPageSource() - returns source code of the page
		//System.out.println(driver.getPageSource());
		
		
		//getWindowHandle() -- Returns the ID of the single browser window
		//String windowid=driver.getWindowHandle();
		//System.out.println("Window ID:" +windowid);//Window ID:192626B2777162BBB09AD6CAFBFDF135 
												   //C9C9E82877D703A2417C0B936D63DFD7
		
		//getWindowHandles() -- Returns the ID of the multiple browser window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser window
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids); //[4B086C43233EA46AF07AEFAFF37DABC5, 4000555196D9E4A334596CB2AD904B5C]
		

		
		

	}

}
