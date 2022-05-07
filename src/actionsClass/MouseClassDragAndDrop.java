package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClassDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source =  driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		
		Actions action = new Actions(driver);
		
		// Both methods will perform drag and drop operations 1st is indirect method and 2nd is direct method
		
	//	action.clickAndHold(source).moveToElement(target).release().build().perform();     // 1st method
		
		 action.dragAndDrop(source, target).build().perform();												// 2nd method

	}

}
