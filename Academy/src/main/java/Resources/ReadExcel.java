package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ReadExcel(String path) {
		
		try {
			File src=new File(path);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	public String getData(int sheetnum, int row,int column) {
		sheet=wb.getSheetAt(sheetnum);
		String data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	public int getRowcount(int sheetindex) {
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;
	}

}
