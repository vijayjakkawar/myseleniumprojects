package hanlingwebelements;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//Wait
			Thread.sleep(5000);
		
		//capture links for a webpage
		
	List<WebElement>	links = driver.findElements(By.tagName("a"));
	
	//printingNumber of links of  a webpage
	System.out.println(links.size());
	
	
	
	for(int i=0; i<links.size(); i++)
	{
		//By using href attribute we can get url of required links
	WebElement elements =	links.get(i);
	String url = elements.getAttribute("href");
	URL link = new URL(url);
	
	// create a connection using url object 'link'
	HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
	
	// wait time 
	Thread.sleep(2000);
	
	// establish connection 
	httpconn.connect();
	
	// return response if responsecode above 400: broken links	
	int rescode = httpconn.getResponseCode();
	
	if(rescode>=400)
	{
		System.out.println(url +"   "+ "is brokrn link");
	}
	else
	{
		System.out.println(url +"   "+ "is  valid  link");
	}
	}
	
	
	
	}

}
