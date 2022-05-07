package HowToUseHashMapInSelenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;

public class HashMapInSelenium {
	
	public static HashMap<String,String> loginData()
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury2");
		
		return hm;
	}
	
	

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		// login as x 
		String credential=loginData().get("x");
		String arr[]=credential.split("@");
		
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(arr[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// validation
		
		if(driver.getTitle().equals("Login: Mercury Tours"))
		{
			Assert.assertTrue(true,"Test Is Passed");
		
		}
		else
		{
		
			Assert.assertFalse(false,"Test is failed");
		}
		
		driver.close();
	}

}
