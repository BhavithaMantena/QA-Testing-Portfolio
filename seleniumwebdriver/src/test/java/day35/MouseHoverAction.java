package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
		WebElement tshirt=driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[@title='T-shirts'][normalize-space()='T-shirts']"));
		
		//Mouse hover
		Actions act=new Actions(driver);
		act.moveToElement(women).moveToElement(tshirt).click().build().perform();
		
		//act.moveToElement(women).moveToElement(tshirt).perform();
		
	}

}
