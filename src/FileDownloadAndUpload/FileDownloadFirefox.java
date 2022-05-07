package FileDownloadAndUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadFirefox {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Program Files\\drivers\\geckodriver.exe");
				
		
		// creating firefox browser profile 
		
		FirefoxProfile profile = new FirefoxProfile();
		// mime for download the text file
		profile.setPreference("browser.helperApps.neverAsk", "text/plain");   // set mime types  "https://www.sitepoint.com/mime-types-complete-list/"
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option=new FirefoxOptions ();
		option.setProfile(profile);
		
		WebDriver driver  = new FirefoxDriver(option);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.id("textbox")).sendKeys("Testing text file");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		

	}

}
