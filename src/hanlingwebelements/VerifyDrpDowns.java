package hanlingwebelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDrpDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Program Files//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		WebElement element=driver.findElement(By.id("animals"));
		Select se=new Select(element);
		
		List originalList=new ArrayList();
		List tempList=new ArrayList();
		
		List <WebElement>options=se.getOptions();
		for(WebElement e:options)
		{
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println( "Before Sorting original list " +originalList);
		
		
		System.out.println("Before Sorting temp list" +tempList);
		Collections.sort(tempList);
		System.out.println("After Sorting" +tempList);
		System.out.println( "After Sorting " +originalList);
		
		if(originalList==tempList)
		{
			System.out.println("Dropedown Sorted");
		}
		else 
		{
			System.out.println("Dropedown Not Sorted");
		}
		driver.close();
	}
 
}
