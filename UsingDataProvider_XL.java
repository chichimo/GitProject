package amazonTestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider_XL {
	
	@Test(dataProvider="Credentials")
	
	public void OHRMLogin(String Username, String pwd) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		driver.quit();
	}
	
	@DataProvider(name="Credentials")
	
	public Object [][] testData() throws IOException {
		
		ExcelUtility obj = new ExcelUtility();

		obj.excelbook("C:\\Users\\hashi\\eclipse-workspace\\TestNG_pro\\OrangeHRM.xlsx");
		
		int rows = obj.rowCount(0);
		int cells = obj.cellCount(0);
		
		System.out.println(rows);
		System.out.println(cells);
		
		Object [][] data = new Object [rows][cells];
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cells; j++) {
				String value = obj.exceldata(0, i, j);
				System.out.println(value);
				data [i][j] =value;
			}
		}
		return data;
	}

}
