package hanlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Program Files//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/samplehtml.htm");
	int r=driver.findElements(By.xpath("/html/body/div/table/tbody/tr")).size();
	System.out.println(r);
	int c=driver.findElements(By.xpath("/html/body/div/table/tbody/tr[1]/td")).size();
	System.out.println(c);
	for(int i=2; i<=r; i++) {
		for(int j=1; j<=c; j++) 
		{
			System.out.print(driver.findElement(By.xpath("/html/body/div/table/tbody/tr["+i+"]/td["+j+"]/p")).getText()+" ");
		
		}
		System.out.println();
	}
	
		
	}
}
