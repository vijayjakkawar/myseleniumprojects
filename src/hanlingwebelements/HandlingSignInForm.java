package hanlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSignInForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.findElement(By.id("btn2")).click();
		
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("jakkawar");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("vijay");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Hyderabsd");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9502578945");
		
		//System.out.println(driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).isSelected());
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
		
		// drop down box (different different drop down boxes)
		
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.className("ui-corner-all")).click();
				
		WebElement skills = driver.findElement(By.id("Skills"));
		
		Select select = new Select(skills);
		
	         // select any one option  
		
		select.selectByIndex(1);                                            // fisrst select this option   
		select.selectByValue("Adobe Photoshop");				 // second select this option
		select.selectByVisibleText("Analytics");					 // finally  select this option and this will we displayed

	//WebElement country = driver.findElement(By.className("select2-selection select2-selection--single"));
	//Select select1 = new Select(country);
	//select1.selectByValue("India");
	
		driver.findElement(By.id("countries")).click();
		driver.findElement(By.className("select2-results__option")).click();
		
	WebElement year = driver.findElement(By.id("yearbox"));
	Select select2 = new Select(year);
	select2.selectByValue("1995");
	
	WebElement month = driver.findElement(By.id("monthbox"));
	Select select3 = new Select(month);
	select3.selectByValue("September");
	
	WebElement date = driver.findElement(By.id("daybox"));
	Select select4= new Select(date);
	select4.selectByValue("28");
	
	driver.findElement(By.id("firstpassword")).sendKeys("1235896");
	driver.findElement(By.id("CPassword")).sendKeys("CPassword");
	driver.findElement(By.id("submitbtn")).click();
	
	
	
	
	
		

		
		
		
		
;		
		
	}

}
