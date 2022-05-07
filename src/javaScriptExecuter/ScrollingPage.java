/*
JavaScriptExecutor in Selenium WebDriver:
In general, we do click on an element using click() method in Selenium.

Sometimes web controls don’t react well against selenium commands and we may face 
issues with the above statement (click()). 
To overcome such kind of situation, we use JavaScriptExecutor interface.


It provides mechanism to execute Javascript through Selenium driver. 
It provides “executescript” & “executeAsyncScript” methods, 
to run JavaScript in the context of the currently selected frame or window.

There is no need to write separate script to execute JavaScript within the browser 
using Selenium WebDriver script. 
Just use predefined interface named ‘Java Script Executor’. We need to import 
the below package in the script.

*/

package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1.scrolling by pixel
		// js.executeScript("window.scrollBy(0,1000)", "");

		// 2.scroll page till find the element
		
		// WebElement flag=
		// driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		// js.executeScript("arguments[0].scrollIntoView()", flag);

		// 3. scroll page till page down
		// js.executeScript("window.scrollTo(0,document.body.scollheight)");

	}

}
