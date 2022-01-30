package datapack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util {

    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;

    public static Object[][] getTableArray(InputStream ExcelFile, String SheetName) throws Exception {
        String[][] tabArray = null;
        try {
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
            int startRow = 1;
            int totalRows = ExcelWSheet.getLastRowNum() - ExcelWSheet.getFirstRowNum() + 1;
            tabArray = new String[totalRows][];
            for (int i = startRow; i < totalRows; i++) {
                int ColnumForRow = ExcelWSheet.getRow(i).getLastCellNum();
                tabArray[i] = new String[ColnumForRow];
                for (int j = 0; j < ExcelWSheet.getRow(i).getLastCellNum(); j++) {
                    if (getCellData(i, j).isEmpty()) {
                        System.out.println("\nEMPTY \n");
                    } else {
                        tabArray[i][j] = getCellData(i, j);
                    }
                }
            }
            return (tabArray);
        } catch (FileNotFoundException e) {
            System.out.println("Could not read the Excel sheet");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not read the Excel sheet");
            e.printStackTrace();
        }
        return (tabArray);
    }

    public static String getCellData(int RowNum, int ColNum) throws Exception {
        try {
            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
            String CellData = Cell.getStringCellValue();
            return CellData;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw (e);
        }
    }
}

