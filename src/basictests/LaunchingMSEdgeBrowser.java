package basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingMSEdgeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.edge.driver", "C:\\Program Files\\drivers\\microsoftwebdriver.exe");
		WebDriver driver  = new EdgeDriver();
		
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/");
        
	

	}

}
