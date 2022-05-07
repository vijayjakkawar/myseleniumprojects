package javaScriptExecuter;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.*;

public class JavascriptExecutorTest {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.twoplugs.com/");

		driver.manage().window().maximize();

		// Syntax
		// -------------
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript(script, args);

		// 1.flash
		// ---------------------
		WebElement joinfree = driver.findElement(By.xpath(
				"//body/div[@class='wrapper']/header/div[@class='container']/ul[@class='control-bar']/li/a[@class='btn green']/span[1]"));
		// JavaScriptUtil.flash(joinfree,driver);

		// 2.Drawing border & take screenshot
		// ------------------
		JavaScriptUtil.drawBorder(joinfree, driver);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File trg = new File(".//Screenshots/joinfree.png");
		FileUtils.copyFile(src, trg);
	

		// 3.Getting title of the page
		// ---------------------------
		String title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);

		// 4.Clicking on element
		// --------------------------
		// WebElement
		// loginBtn=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		// JavaScriptUtil.clickElementByJS(loginBtn,driver);

		// 5. Generate alert
		// --------------------------
		// JavaScriptUtil.generateAlert(driver, "Clicked on Login Button");

		// 6.Refreshing page
		// ----------------
		JavaScriptUtil.refreshBrowserByJS(driver);

		// 7.get page inner text
		// -------------
		// System.out.println(JavaScriptUtil.getPageInnerText(driver));

		// 8.Scrolling down page
		// JavaScriptUtil.scrollPageDown(driver);

		// Scroll we find element on page
		WebElement image = driver.findElement(By.id("rslides3_s0"));
		JavaScriptUtil.scrollIntoView(image, driver);

	}
}
