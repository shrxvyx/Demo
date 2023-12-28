package testPkge;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String args[]) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		TakesScreenshot s=(TakesScreenshot)driver;
		File temp=s.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\Screenshot\\"+"Redbus"+
		System.currentTimeMillis()+".png");
		FileHandler.copy(temp, dest);
		System.out.println("Screenshot is done!");		
		
	}
}
