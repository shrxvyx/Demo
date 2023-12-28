package testPkge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpdwn 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver d8=new ChromeDriver();
		d8.get("https://www.amazon.in/");
		WebElement ele=d8.findElement(By.name("url"));
		Select dd=new Select(ele);
		dd.selectByIndex(3);
		Thread.sleep(1000);
		dd.selectByValue("search-alias=instant-video");
		Thread.sleep(1000);
		dd.selectByVisibleText("Video Games");
		
		List<WebElement>i=dd.getOptions();
		for(WebElement j:i)
		{
			System.out.println(j.getText());
		}
	}
	
}
