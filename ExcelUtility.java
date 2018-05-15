package amazonTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtility {
	
	FileInputStream fis;
	XSSFWorkbook xlBook;
	XSSFSheet xlSheet;
	
//	public void excelbook (String fpath) throws IOException {
//		
//			fis = new FileInputStream(fpath);
//			xlBook = new XSSFWorkbook(fis);
//	}
	
	public String exceldata(int SheetNumber, int row, int cell) {
		
		xlSheet = xlBook.getSheetAt(0);
		String xlValue = xlSheet.getRow(row).getCell(cell).toString();
		return xlValue;
	}
	
	public int rowCount(int SheetNumber) {
		int rows = xlBook.getSheetAt(SheetNumber).getLastRowNum();
		return rows+1;
	}
	
	public int cellCount (int SheetNumber) {
		int cells = xlBook.getSheetAt(SheetNumber).getRow(0).getLastCellNum();
		return cells;
	}

	public void excelbook(String fpath) throws IOException {
		// TODO Auto-generated method stub
		fis = new FileInputStream(fpath);
		xlBook = new XSSFWorkbook(fis);
	}
	

}
