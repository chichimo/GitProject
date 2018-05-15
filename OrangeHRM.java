package seleniumtry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeAppFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");

		// Ctrl + Shift + O
		WebDriver driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Add Emp")).click();
		driver.findElement(By.name("firstName")).sendKeys("Hashim");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("1500");
		
		Thread.sleep(5000);
		driver.quit(); //completely kills the process, 
	}

}
