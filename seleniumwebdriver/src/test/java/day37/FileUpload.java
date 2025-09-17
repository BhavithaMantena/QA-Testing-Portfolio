package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//Single file upload  -- Test1.txt
	/*	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Automation\\Test1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("Test1.txt"))
		{
			System.out.println("File is successfully uploaded");
		}
		else
		{
			System.out.println("Upload failed");
		}
		*/
		
		//Multiple files upload
		String file1="D:\\Automation\\Test1.txt";
		String file2="D:\\Automation\\Text2.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id=\"fileList\"]//li")).size();
		if(noOfFilesUploaded==2)
		{
			System.out.println("All Files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded or inorrect files uploaded");
		}
		
		//Valid File names
		
		if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li[1]")).getText().equals("Test1.txt")&&
				driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li[2]")).getText().equals("Text2.txt"))
		{
			System.out.println("File names matching..");
		}
		else
		{
			System.out.println("Files are not matching");
		}
		
		
		
		
	}

}
