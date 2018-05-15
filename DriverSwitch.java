package seleniumtry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMainFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public static WebDriver getWebDriver (String browser) {
			WebDriver driver;
			
			String browser1 = "chrome";
			
			switch(browser1) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
				driver = new ChromeDriver();
				break;
				
			case "Firefox":
				System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
			    driver = new ChromeDriver();
			    break;
			    
			    default:
			    	System.out.println("Browser not found");
			    	driver = null;
			}
			return driver;
			}
		

	}

}
