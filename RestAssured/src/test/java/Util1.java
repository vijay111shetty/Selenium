import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util1 {

	public class DataDrivenTest {

		public ArrayList<String> getData(String sheetname, String columnname, String candidateid) throws IOException {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\lenovo\\eclipse-workspace\\RestAssured\\src\\test\\java\\resources\\testData2.xlsx");
			//XSSFWorkbook class to get access to excel
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			ArrayList<String> al = new ArrayList<String>();
			//to get totoal number of sheets
			int numberOfSheets = workbook.getNumberOfSheets();
			System.out.print(numberOfSheets);
			for (int i = 0; i < numberOfSheets; i++) {
				//get particular sheet
				if (workbook.getSheetName(i).equalsIgnoreCase(sheetname)) {
					//get specific sheet, sheet is collection of rows
					XSSFSheet sheet = workbook.getSheetAt(i);
					Iterator<Row> rows = sheet.iterator();
					Row firstrow = rows.next();// first row
					Iterator<Cell> cells = firstrow.cellIterator();// itering throufh cell
					int k = 0;
					int column = 0;
					while (cells.hasNext()) {
						Cell value = cells.next();
						//getting cell value in first row
						while (value.getStringCellValue().equalsIgnoreCase(columnname)) {
							column = k;
							System.out.println(column);
							break;
						}
						k++;
					}

					System.out.println(column);

					while (rows.hasNext()) {
						Row row = rows.next();
						if (row.getCell(column).getStringCellValue().equalsIgnoreCase(candidateid)) {
							Iterator<Cell> ce = row.cellIterator();

							while (ce.hasNext()) {
								Cell c = ce.next();
								if (c.getCellType() == CellType.STRING) {
									al.add(c.getStringCellValue());
								}

								else {
									al.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								}

							}
						}
					}

				}
			}
			return al;
		}

		public void main(String[] args) throws IOException {

			DataDrivenTest obj = new DataDrivenTest();
			ArrayList<String> as = obj.getData("testdata", "TestCases", "Candidate");
			System.out.print(as);
			System.out.println(as.get(1));
			System.out.println(as.get(2));
		}

	}

}
