package actionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseClassDagAndDropAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes-demo3.html");    // 1st assignment
		
		//driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");                 // 2nd assignment

	}

}
