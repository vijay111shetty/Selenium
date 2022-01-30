package KeyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	static XSSFSheet Excelsheet;
	static XSSFWorkbook excelworkbook;
	static XSSFCell cell;

	public static void setExcelFile(String path, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		excelworkbook = new XSSFWorkbook(fis);
		Excelsheet = excelworkbook.getSheet(sheetname);

	}

	public static String getCellData(int rownum, int columnnum) {
		cell = Excelsheet.getRow(rownum).getCell(columnnum);
		String celldata = cell.getStringCellValue();
		return celldata;
	}

}
