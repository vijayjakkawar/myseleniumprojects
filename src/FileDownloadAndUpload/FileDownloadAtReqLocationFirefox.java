package FileDownloadAndUpload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadAtReqLocationFirefox {

	public static void main(String[] args) {
		
		// to avoid pop up window while downloading the text or pdf or any thing
		FirefoxProfile profile=new FirefoxProfile();
		
		profile.setPreference("browser.helperApp.neverAsk.saveToDisk","tex/plain,application/pdf");  // set mime for which type of file we are downloadig
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		// code for download file at our desired location
		profile.setPreference("browser.download.dir","D:\\vj");
		profile.setPreference("pdfjs.disable",true);  //only for pdf file 
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile); 
		
		
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Program Files\\drivers\\geckodriver.exe");
	//	WebDriver driver  = new FirefoxDriver(option);
		WebDriver driver  = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
	
		
		// to download  text file 
		driver.findElement(By.id("textbox")).sendKeys("Testing");      // passes value in text box
		driver.findElement(By.id("createTxt")).click();						 //  generates download link and click on that
		driver.findElement(By.id("link-to-download")).click();    		// displays download link than click on it
		
		
		
		if(isFileExist("C:\\Users\\hp\\Downloads\\info.txt"))
		{
			System.out.println("text File Exists");
		}
		else
		{
			System.out.println("text file not exist");
		}
		// to download pdf 
		driver.findElement(By.id("pdfbox")).sendKeys("Testing Pdf"); 		// passes value in text box
		driver.findElement(By.id("createPdf")).click();								//  generates download link and click on that
		driver.findElement(By.id("pdf-link-to-download")).click();				// displays download link than click on it
		
		if(isFileExist("C://Users//hp//Downloads/info.pdf"))
		{
			System.out.println("pdf File Exists");
		}
		else
		{
			System.out.println("pdf file not exist");
		}
		
		
	  

	}

	 static boolean isFileExist(String path)
	{
		File f=new File(path);
		if(f.exists())
		{
			return true;
		}
		else
		{
		return false;
	}
	
		//driver.quit();
	}

}
