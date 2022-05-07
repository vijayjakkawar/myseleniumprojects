package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClassSlider {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		/*
		 * System.setProperty(
		 * "webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
		 * WebDriver driver=new FirefoxDriver();
		 */
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		WebElement slider =  driver.findElement(By.xpath("/html/body/div/span"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();     // drag the slider and drops
	}

}
