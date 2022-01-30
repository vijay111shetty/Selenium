package EXCELDemoBySDET;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingEXCEL {

	public static void main(String[] args) throws IOException {
		String excelfilepath=".\\DataFile\\SDET.xlsx";
		FileInputStream fis=new FileInputStream(excelfilepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//XSSFSheet sheet=workbook.getSheet("Sheet 1");
		
		//we can get the sheet by index value also
		XSSFSheet sheet=workbook.getSheetAt(0);
		//Using For loop
		int rows=sheet.getLastRowNum();//gives the total number of rows
		int columns=sheet.getRow(0).getLastCellNum();//gives the total number of columns
		for(int i=0;i<rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<columns;j++)
			{
				XSSFCell cell=row.getCell(j);
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue()); break;
				case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				}
			}System.out.println();
		}
		
		
		//Using while loop
		Iterator iterator=sheet.iterator();
		while(iterator.hasNext()) {
			XSSFRow row=(XSSFRow) iterator.next();
			Iterator celliterator=row.cellIterator();
			while(celliterator.hasNext()) {
				XSSFCell cell=(XSSFCell) celliterator.next();
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue()); break;
				case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				}
			}System.out.println();
			}
		}
	

}
