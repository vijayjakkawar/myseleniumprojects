package hanlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAuthenticationPopUpWindows {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 */

		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		// for authentication pop up instead of giving url only we should give url with
		// username and password
		// syntax ( // http://username:password@test.com )

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		
		  String text = driver.findElement(By.cssSelector("p")).getText();
		  System.out.println(text);
		 
	}

}
