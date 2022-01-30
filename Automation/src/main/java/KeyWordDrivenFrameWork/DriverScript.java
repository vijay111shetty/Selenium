package KeyWordDrivenFrameWork;

import java.io.IOException;

public class DriverScript {

	public static void main(String[] args) throws IOException, InterruptedException {
		String sPath="C:\\Users\\lenovo\\eclipse-workspace\\Automation\\KeyWordDriven.xlsx";
		ReadExcelData.setExcelFile(sPath, "Sheet1");
		
		for(int iRow=1;iRow<=7;iRow++) {
			String sAction=ReadExcelData.getCellData(iRow, 1);
			if(sAction.equals("openBrowser"))
			{
				Methods.openBrowser();
			}
			else if(sAction.equals("navigate")) {
				Methods.navigate();
			}
			else if(sAction.equals("input_Username")){
				Methods.input_Username();
			}
			else if(sAction.equals("input_Password")) {
				Methods.input_Password();
			}
			else if(sAction.equals("click_Login")) {
				Methods.click_Login();
			}
			else if(sAction.equals("verify_Login")) {
				Methods.verify_Login();
			}
			else if(sAction.equals("closeBrowser")) {
				Methods.closeBrowser();
			}
	}}
}
