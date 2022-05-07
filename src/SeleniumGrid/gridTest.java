package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gridTest {
	
	public WebDriver driver;
	
	@Test
	public void setup()
	{		
		driver.findElement(By.id("username")).sendKeys("vijay@gmail.com");
		driver.findElement(By.name("password")).sendKeys("@#Vv584529");
		driver.findElement(By.name("login")).click();
	}
	
	@BeforeMethod
	public void test() throws MalformedURLException
	{
		DesiredCapabilities Dcap= new DesiredCapabilities();
		Dcap.setBrowserName("chrome");
		Dcap.setPlatform(Platform.WIN10);
		driver=new RemoteWebDriver(new URL("http:localhost:4444"),Dcap);
		driver.get("http://practice.automationtesting.in/my-account/");

	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
