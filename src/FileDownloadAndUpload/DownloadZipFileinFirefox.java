package FileDownloadAndUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadZipFileinFirefox {

	public static void main(String[] args) throws InterruptedException  {


System.setProperty("Webdriver.gecko.driver", "C:\\Program Files\\drivers\\geckodriver.exe");
				
		
		// creating firefox browser profile 
		
		FirefoxProfile profile = new FirefoxProfile();
		// mime for download the zip file
		profile.setPreference("browser.helperApps.neverAsk", "application/zip");   // set mime types  "https://www.sitepoint.com/mime-types-complete-list/"
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option=new FirefoxOptions ();
		option.setProfile(profile);
		
		WebDriver driver  = new FirefoxDriver(option);
		driver.get("");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(""));
		
		
		
		

	}

}
