package amazonTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonCrossBrowser {
	
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void Browser(String BrowserName) {
		
		if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://www.amazon.com");
		} 
		else if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.amazon.com");
		} else {
			System.out.println("Please check if you have the right JARs");
		}
		
	}
}
