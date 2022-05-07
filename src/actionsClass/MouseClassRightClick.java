package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClassRightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * System.setProperty(
		 * "webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
		 * WebDriver driver=new FirefoxDriver();
		 */
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions action = new Actions(driver);

	//	WebElement button = driver.findElement(By.xpath("/html/body/span"));

	//	action.contextClick(button).build().perform(); // right click on the element

		driver.findElement(By.xpath("/html/body/button")).click();

		 System.out.println(driver.switchTo().alert().getText()); // captures the text
		//  from alert box
		 driver.switchTo().alert().accept(); // accepts the alert box

	}

}
