package hanlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatesrsUsingXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
// using Tagname finding how many links available in the page
	int links=driver.findElements(By.tagName("a")).size();
	System.out.println(links);
	
	    
	
// loacting elements using "id & name"
	
/*	driver.findElement(By.name("field-keywords")).sendKeys("iphone13");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	// locating elements using linktext
	driver.findElement(By.linkText("Apple iPhone 13 (128GB) - (Product) RED")).click();  */
	
	      //loacting elements using cssSelector (tag & id)
	
//	driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone13");
//	driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();     
	
            //loacting elements using cssSelector (tag & class)
	
//  driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute")).sendKeys("iphone13");
//  driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();   //class name same for many elements so this line is not working
	
	
	
            //loacting elements using cssSelector (tag & attribute)
	
//	driver.findElement(By.cssSelector("input[name=field-keywords]")).sendKeys("iphone13");
//	driver.findElement(By.cssSelector("input[id=nav-search-submit-button]")).click();    
	
            //loacting elements using cssSelector (tag, class & attribute)
	
//	driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute[name=field-keywords]")).sendKeys("iphone13");
		
//	driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();  
	
          //loacting elements using Xpath 
	
	
	
	
	
	}

}
