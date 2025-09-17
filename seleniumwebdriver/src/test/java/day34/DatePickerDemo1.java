package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatePickerDemo1 {
	
//selecting future date
	
static void selectFutureDate(WebDriver driver,String year, String month,String date)
	{
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
		}
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
	}
	}
		
//selecting past date

static void selectPastDate(WebDriver driver,String year, String month,String date)
	{
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //next
		}
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
	}
	}
		
	
	
	/*static void selectMonthAndYear(WebDriver driver,String month, String year)
	{
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
		}
	}
	
	//select the date
	static void selectDate(WebDriver driver, String date)
	{	
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
*/
	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//Method:1  using sendkeys()
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/24/2025"); //mm//yy/yyyy
		
		
		//Method 2 expected data
		
		String year="2024";
		String month="March";
		String date="20";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();  //opens date picker
		//selectFutureDate(driver,year,month,date);
		selectPastDate(driver,year,month,date);
		//selectMonthAndYear(driver, month, year);
		//selectDate(driver, date);
	
		
		
		
		
		//select month and year
		
		/*while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
		}*/
		
		
		/*String pyear="2025";
		String pmonth="May";
		String pdate="20";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();  //opens date picker
		
		//select month and year
		
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year
			
			if(currentMonth.equals(pmonth) && currentYear.equals(pyear))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous
		}*/
		
		//select the date
		
	/*	List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		*/
		
		
		
		

	}

}
