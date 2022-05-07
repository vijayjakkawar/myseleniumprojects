package hanlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable2 {
    // orangeHRM
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Program Files//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		
		int rowcount = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/thead/tr/th[1]")).size();
		int statuscount= 0;
		for (int i=1; i<rowcount; i++) {
			String status = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr[" + i + "]/td[5]")).getText();
			if(status.equals("Enabled")) {
				statuscount=statuscount +1;
				
			}
		}
		
      System.out.println("No of Employees Enabled:" +statuscount);
     // driver.close();
	}
	
		
	}

