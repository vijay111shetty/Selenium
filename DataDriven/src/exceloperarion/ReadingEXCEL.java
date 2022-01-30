package exceloperarion;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingEXCEL {

	public static String[][] main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String[][] tabArray = new String[16][2];
		String excelfilepath = ".\\DataFile\\Book1.xlsx";
		FileInputStream inputstream = new FileInputStream(excelfilepath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheetAt(0);// XSSFSheet sheet=workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		for (int r = 1; r <= row; r++) {
			XSSFRow rows = sheet.getRow(r);
			for (int c = 0; c < col; c++) {
				XSSFCell cell = rows.getCell(c);
				tabArray[r][c]=cell.getStringCellValue();
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				// case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				// case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				}
				System.out.print("  |   ");
			}
			System.out.println("");
			//System.out.println(tabArray);
		}return tabArray;
		//System.out.println(tabArray);

	}

}
