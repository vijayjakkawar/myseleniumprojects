package capturingImgs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class comparingCapturedImg {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        BufferedImage exptlogoImg=ImageIO.read(new File("paste the  location of image in local machine"));
     WebElement  actlogoimg= driver.findElement(By.xpath("//div[@id='divLogo']//img"));
     Screenshot logoImgScreenshot=new AShot().takeScreenshot(driver, actlogoimg);
     
     BufferedImage actual_img=logoImgScreenshot.getImage();
     
     ImageDiffer imgdiff=new ImageDiffer();
     ImageDiff diff=imgdiff.makeDiff(exptlogoImg, actual_img);
     if(diff.hasDiff()==true)
     {
    	 System.out.println("image are not same");
     }
     else
     {
    	 System.out.println("image are same");
     }
     
     driver.quit();
	}

}
