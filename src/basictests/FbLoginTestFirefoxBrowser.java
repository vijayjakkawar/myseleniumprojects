package basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginTestFirefoxBrowser {

	
	public static void main(String[] args) {
		
		// Using Firefox Driver
		
		System.setProperty("webdriver.firefox.marionette","C://Program Files//drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("9502589165");
		driver.findElement(By.name("pass")).sendKeys("vij@y143");
		driver.findElement(By.name("login")).click();
		
		
		String exp_title="Facebook – log in or sign up"; 
		
		
		
		String act_title=driver.getTitle();
		
		if( exp_title.equals( act_title)==true)
{
		System.out.println("Test is Pass ");
}
		else
		{
			System.out.println("Test is fail ");
		}
		driver.close();
	}

}
