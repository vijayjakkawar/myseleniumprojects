package FileDownloadAndUpload;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileDownloadAtReqLocationChrome {

	public static void main(String[] args) {
		
		// download file at required location using chrome browser
		HashMap<String, Object> chromeprefers = new HashMap<String,Object>();
		chromeprefers.put("profile.default_content_settings.popups", 0);
		chromeprefers.put("download.promot_for_download", "false");
		chromeprefers.put("doenload.default_directory", "D:\\vj");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefers", chromeprefers);
		
		DesiredCapabilities cap= DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		// to download  text file 
				driver.findElement(By.id("textbox")).sendKeys("Testing");      // passes value in text box
				driver.findElement(By.id("createTxt")).click();						 //  generates download link and click on that
				driver.findElement(By.id("link-to-download")).click();    		// displays download link than click on it
				
				if(isFileExist("D:\\vj\\info.txt"))
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
				
				if(isFileExist("D:\\vj\\info.pdf"))
				{
					System.out.println("pdf File Exists");
				}
				else
				{
					System.out.println("pdf file not exist");
				}
				

			}

			 private static DesiredCapabilities DesiredCapabilities() {
		// TODO Auto-generated method stub
		return null;
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
			}


}
