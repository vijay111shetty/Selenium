package common;

import java.io.FileInputStream;
import java.io.InputStream;

public class datadriven {
	public String[][] GetTestData() throws Exception {
        //InputStream is = this.getClass().getResourceAsStream("/testData.xlsx");
		String filestream=".\\src/test/java\\resources\\testData.xlsx";
		FileInputStream FIS=new FileInputStream(filestream);
        String[][] testObjArray =  Util.getTableArray(FIS, "Sheet1");
        System.out.println(testObjArray);
        return (testObjArray);
        //C:\Users\lenovo\eclipse-workspace\RestAssured\src\test\java\resources\testData.xlsx
    }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		datadriven a=new datadriven();
		System.out.println(a.GetTestData());
		

		

	}
}
