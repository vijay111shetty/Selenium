package HybridFrameWork;

import java.lang.reflect.Method;

public class DriverScriptJava {
	static Actions actionKeyword;
	static String sAction;
	static Method method[];

	public static void main(String[] args) throws Exception {
		String sPath = "C:\\Users\\lenovo\\eclipse-workspace\\Automation\\KeyWordDriven.xlsx";
		ReadExcel.setExcelFile(sPath, "Sheet1");
		for (int iRow = 1; iRow <= 7; iRow++) {
			sAction = ReadExcel.getCellData(iRow, 1);
			execute_Actions();
		}

	}

	private static void execute_Actions() throws Exception {
		actionKeyword = new Actions();
		method = actionKeyword.getClass().getMethods();
		for (int i = 0; i < method.length; i++) {
			if (method[i].getName().equals(sAction)) {
				method[i].invoke(actionKeyword);
				break;
			}
		}
	}

}
