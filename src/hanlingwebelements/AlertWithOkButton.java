package hanlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithOkButton {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		
		// switch to alert box
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); // ok button clicked and close alert button
		
		
		
	}

}
