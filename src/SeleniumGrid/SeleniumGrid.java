package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import jline.internal.TestAccessible;

public class SeleniumGrid {

	/*
	 * grid is a component of a selenium used for executing the test cases remotely
	 * here we follow hub and node concept Hub(Master)----->one hub
	 * Node(slave)--->many number of nodes
	 * 
	 * pre-requisites conditions ---------------------------------- we should have
	 * drivers and browsers on local & remote systems make local system as hub and
	 * register all the VM's (nodes) with hub
	 * 
	 * convert local system as hub server using command ( java -jar
	 * selenium-server-standalone-3.141.59.jar -role hub ) in command prompt
	 * -----------------------------------------------------------------------------
	 * -------------------------------------------------- Nodes should register to
	 * http://192.168.29.216:4444/grid/register/ Clients should connect to
	 * http://192.168.29.216:4444/wd/hub
	 * 
	 * yo check hub is running or not open below link in browser
	 * -----------------------------------------------------------------------------
	 * -- http://localhost:4444/grid/console
	 * 
	 * register node with hub server using command
	 * --------------------------------------------- java
	 * -Dwebdriver.chromr.driver="C:\Program Files\drivers" -jar
	 * selenium-server-standalone-3.141.59.jar -role node -hub
	 * http://192.168.29.216:4444/grid/register/
	 * 
	 * 
	 * 1. download selenium server jar.. 2. add jar file to local and remote
	 * machines 3. we need to have same jar on all VM's write test cases and execute
	 * on remote systems
	 */

	public static void main(String[] args) throws MalformedURLException {

		String nodeurl = "http://192.168.29.216:4444/grid/register";
		DesiredCapabilities Dcap = new DesiredCapabilities();
		Dcap.setBrowserName("chrome");
		Dcap.setPlatform(Platform.WIN10);

		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new RemoteWebDriver(new URL(nodeurl),Dcap);

		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("username")).sendKeys("vijay@gmail.com");
		driver.findElement(By.name("password")).sendKeys("@#Vv584529");
		driver.findElement(By.name("login")).click();

	

		driver.close();
	}
}
