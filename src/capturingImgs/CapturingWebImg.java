package capturingImgs;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CapturingWebImg {

	public static void main(String[] args) throws IOException  {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
      WebElement logoimgelement= driver.findElement(By.xpath("//div[@id='divLogo']//img"));
     Screenshot logoimgscreenshot=new AShot().takeScreenshot(driver, logoimgelement);
     ImageIO.write(logoimgscreenshot.getImage(), "png", new File("C://Program Files/images/orangeHRM.png"));
     
     File f=new File("C://Program Files/images/orangeHRM.png");
     
     if(f.exists())
     {
    	 System.out.println("image is captured");
     }
     else
     {
    	 System.out.println("image is not captured");
     }
      
	
	}

}
