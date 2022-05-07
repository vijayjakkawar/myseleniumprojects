package actionsClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {
	
	public static void main(String args[]) throws InterruptedException, MalformedURLException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		 
		
		// implicit wait for 10sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url
		 driver.get("https://testproject.io/events/");
		 //wait
		 Thread.sleep(5000);
		 // capture links from a website
		 List  <WebElement> links = driver.findElements(By.linkText("a"));
		 
		 
		 // number of links
		 System.out.println(links.size());
		 
		 for(int i=0; i<links.size(); i++)
		 {
			 // by using href attribute we can get url of required link
			WebElement element =  links.get(i);
			String url = element.getAttribute("href");
			
			URL link=new URL(url);
		 }
		
		
		 
		 
		
		 
		
		
		
		
	}

}
