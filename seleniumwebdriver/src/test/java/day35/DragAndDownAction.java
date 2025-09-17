package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDownAction {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		WebElement frame1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		
		//drag and drop action
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, destination).perform();
	}

}
