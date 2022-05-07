package FileDownloadAndUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {
	
	// robot class used for simulate keyboard and mouse actions
	// robot class used for file upload and download 
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Program Files\\drivers\\geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		// to download  text file 
		driver.findElement(By.id("textbox")).sendKeys("Testing");      // passes value in text box
		driver.findElement(By.id("createTxt")).click();						 //  generates download link and click on that
		driver.findElement(By.id("link-to-download")).click();    		// displays download link than click on it
		
		Robot robot=new Robot();
		Thread.sleep(3000);
		/*
		 down arrow
		 3 times tab key
		 enter
		 */
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
			
		
	}

}
