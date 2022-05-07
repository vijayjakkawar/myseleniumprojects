package basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	
	public static void main(String[] args) {
		
		// Using Chrome Driver
		
		System.setProperty("webdriver.chrome.driver","C://Program Files//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("9502589165");
		driver.findElement(By.name("pass")).sendKeys("vij@y143");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		/*
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
		*/
	}

}
