package hanlingwebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersUsingAxesXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		// self node  Xpath
		String text=driver.findElement(By.xpath("//a[contains(text(),'Linc L')]/self::a")).getText();
        System.out.println(text);
        
        // parent node 
        text= driver.findElement(By.xpath("//a[contains(text(),'Linc L')]/parent::td")).getText();
        System.out.println(text);
        
        // child node 
       List<WebElement> childs=driver.findElements(By.xpath("//tbody/tr[7]/td[1]/ancestor::tr/child::td"));
        System.out.println("number of child elements:"+childs.size());
        
        // Ancestor node
       text=driver.findElement(By.xpath("//tbody/tr[7]/td[1]/ancestor::tr")).getText();
       System.out.println(text);
             
    // descendant node     
       List<WebElement> descendants=driver.findElements(By.xpath("//tbody/tr[7]/td[1]/ancestor::tr/descendant::*"));
       System.out.println("number of descendant elements:"+descendants.size());
        
       // following node 
       
        
        driver.close();
	}

}
