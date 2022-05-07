package barcodes;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRcode {

	public static void main(String[] args) throws IOException, NotFoundException {
	
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.get("http://testautomationpractice.blogspot.com/");
        
        String QRcodeURL=driver.findElement(By.xpath("//div[@id='HTML4']//img")).getAttribute("src");
        
        URL url=new URL(QRcodeURL);
        
        BufferedImage bufferedimage=ImageIO.read(url);
        LuminanceSource luminancesource=new BufferedImageLuminanceSource(bufferedimage);
        BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(luminancesource));
       Result result= new   MultiFormatReader().decode(binarybitmap);
       System.out.println(result.getText());
        
        
	}

}
