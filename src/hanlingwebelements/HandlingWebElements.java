package hanlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
	
		
		
		// drop down box 
	/*
		WebElement dropspeed=driver.findElement(By.id("speed"));
		Select speed=new Select(dropspeed);
		speed.selectByIndex(3);   //by index
		speed.selectByValue("2");  // by value
		speed.selectByVisibleText("Slower"); // by visible text
		System.out.println(speed.getOptions().size()); // to get no of items present in the drop down 
		
				*/
		//  radio buttons (using conditional commends)
		
		System.out.println(driver.findElement(By.id("  write radio button value   ")).isSelected()); // it returns weather the radio button is seleted or not if selected true if not false
		driver.findElement(By.id("  ")).click(); // radio button 
		
		// check boxes selections
		
		// by the below methods we can select more than one checkbox  
		//  inspect the button copy the value and write 
		
		driver.findElement(By.id(" specify the value of check box  ")).click();
		driver.findElement(By.id(" specify the value of check box  ")).click();
		driver.findElement(By.id(" specify the value of check box ")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
