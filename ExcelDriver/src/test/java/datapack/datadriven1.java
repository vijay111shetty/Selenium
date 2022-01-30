package datapack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven1 {
	public ArrayList<String> datadrivenmethods(String testcasename) throws IOException
	{
		FileInputStream FIS=new FileInputStream("C:\\Users\\lenovo\\Desktop\\excelwork.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(FIS);
		ArrayList<String> a=new ArrayList<String>();
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("exceldata"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> row=sheet.iterator();
				Row firstrow=row.next();
				Iterator<Cell> ce=firstrow.cellIterator();
				int k=0;
				int column=0;
				while(ce.hasNext())
				{
					Cell c=ce.next();
					if(c.getStringCellValue().equalsIgnoreCase("testcases"))
					{
						column=k;
					}
					k++;
				}
				while(row.hasNext())
				{
					Row r=row.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
					{
						Iterator<Cell> cc=r.cellIterator();
						while(cc.hasNext())
						{
							Cell c=cc.next();
							if(c.getCellType()==CellType.STRING)
							{
								a.add(c.getStringCellValue());
							
							}
							else
							{
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
				}
				
			}
		}return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<Object> dataget(String testcasename) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\ExcelDriver\\src\\main\\resources\\excelwork.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		ArrayList<Object> arr=new ArrayList<Object>();
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("exceldata"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> row=sheet.iterator();
				Row firstrow=row.next();
				Iterator<Cell> ce=firstrow.cellIterator();
				int k=0;
				int column=0;
				while(ce.hasNext()) {
					Cell c=ce.next();
					if(c.getStringCellValue().equalsIgnoreCase("testcases"))
					{
						column=k;
					}k++;
				}
				while(row.hasNext()) {
					Row r=row.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {
						Iterator<Cell> cc=r.cellIterator();
						while(cc.hasNext()) {
							Cell c=cc.next();
							arr.add(c);
						}
					}
				}
			}
		}return arr;
	}

}
