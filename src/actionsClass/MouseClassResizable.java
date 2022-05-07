package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClassResizable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
	WebElement resizable =	driver.findElement(By.xpath("/html/body/div/div[3]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(resizable).dragAndDropBy(resizable, 150, 50).build().perform();		
		

	}

}
