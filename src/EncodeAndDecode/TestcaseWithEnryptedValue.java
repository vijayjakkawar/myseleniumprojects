package EncodeAndDecode;

import java.util.Base64;
import java.util.Base64.Decoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseWithEnryptedValue {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Fdemo");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("jakkawarvijay");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(decodeString(" dmlqYXkxNDM="));
		
		
		
	
	}

	private static CharSequence decodeString(String password) {
		byte[] decoding=Base64.decode(password);
	
		return (new String(decoding));
	}
	}
	
