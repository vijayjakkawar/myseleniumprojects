package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*
		 * System.setProperty(
		 * "webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
		 * WebDriver driver=new FirefoxDriver();
		 */
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList/reset/1");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  
	  
	  Actions actions = new Actions(driver);
	  
	    WebElement admin = driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
	    WebElement usermt = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
	    WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
	    
	//    actions.moveToElement(admin).build().perform(); 					// mouse over to admin
	//    actions.moveToElement(usermt).build().perform(); 				// mouse over to user management
	//    actions.moveToElement(users).click().build().perform(); 			// mouse over to users
	  
	    // we can write above three lines  in single line 
	    actions.moveToElement(admin).moveToElement(usermt).moveToElement(users).click().build().perform();
	    
	   int  rows = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/thead/tr")).size();
	   int count = 0;
	   
	   for(int i=1; i<=rows;  i++)
	   {
		   String status = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/thead[1]/tr["+i+"]/th[5]/a[1]")).getText();
		   
		    if(status.equals("Enabled"))
		   {
			   count++;
		   }
	   }
		

	}

}
