package FileDownloadAndUpload;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
						//firefox browser
		//System.setProperty("Webdriver.gecko.driver", "C:\\Program Files\\drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
							//chrome browser
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("jakkawar");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kumar");
		driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).sendKeys("216");
		driver.findElement(By.xpath("//input[@id='photofile']")).click();
       
	/*
	 String	imagesFilepath="D:\\Sikuli pics\\";
	 String  inputFilepath="D:\\Sikuli pics\\";
	 
		Screen s=new Screen();
		
		Pattern fileInputTextbox=new Pattern(imagesFilepath+"textbox");
		Pattern openButton=new Pattern(imagesFilepath+"open");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextbox, 20);
		s.type(fileInputTextbox,inputFilepath+"love.jpg");
		s.click(openButton);
		
		
		*/

	}

}
