package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class INCOG {

	public static void main(String[] args) {


		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
	}

}
