package hanlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithOkCancelButton {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println(driver.switchTo().alert().getText());
	
		String ExpTextOk="You pressed Ok";
		driver.switchTo().alert().accept();  // accept switches alert with ok button
		String ActTextOk = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		if(ExpTextOk.equals(ActTextOk)==true);
		{
			System.out.println("test is passed");
		}
		
	
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String ExpTextCancel = "Your pressed Cancel";
		driver.switchTo().alert().dismiss();     //dismiss switches alert with ok button
		String ActTextCancel = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		if(ExpTextCancel.equals(ActTextCancel))
		{
			System.out.println("test is passed");
		}
	
		
	

	}

}
