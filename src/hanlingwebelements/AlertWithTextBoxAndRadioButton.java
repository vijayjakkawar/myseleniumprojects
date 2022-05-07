package hanlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithTextBoxAndRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		//   1st time       
		driver.switchTo().alert().sendKeys("vijay");
		driver.switchTo().alert().accept();
		
		String ExpText = "Hello vijay How are you today";
		String ActText = driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		
		if( ExpText.equals(ActText) )
		{
			System.out.println("test is passed");
		}
		
		// 2nd time clicking on radio button
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().sendKeys("vijay jakkawar");
		driver.findElement(By.xpath("      pass xpath of radio button    " )).click();
		driver.switchTo().alert().accept();
		
		
	
		
		

	}

}
