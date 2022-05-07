package FileDownloadAndUpload;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadChrome { 
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
	
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
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
		
		
		//driver.quit();  

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
