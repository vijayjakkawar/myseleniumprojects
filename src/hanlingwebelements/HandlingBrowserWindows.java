package hanlingwebelements;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");

		// driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed
		// Windows']")).click();
		driver.findElement(By.xpath(
				"//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']"))
				.click();
		// System.out.println(driver.getTitle());

		Set<String> s = driver.getWindowHandles();

		for (String i : s) {
			System.out.println(i);
			String t = driver.switchTo().window(i).getTitle();
			System.out.println(t);
			if (t.contains("Selenium")) {
				driver.close();
			}
		}

	}

}
