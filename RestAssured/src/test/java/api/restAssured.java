package api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.Util;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssured {
	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://reqres.in";
	}

	@Test(dataProvider = "getData")
	public void Apitest(String name, String job) {
		// RestAssured.baseURI = "https://reqres.in/api/users";
		/*
		 * RequestSpecification httpRequest = RestAssured.given(); Response response =
		 * httpRequest.request(Method.PUT, "vijay"); Response response1 =
		 * httpRequest.request(Method.PUT, "employee"); String responseBody =
		 * response.getBody().asString(); //System.out.println(responseBody); String
		 * responseBody1 = response1.getBody().asString();
		 * //System.out.println(responseBody1); int statusCode=response.getStatusCode();
		 * System.out.println(statusCode); int statusCode1=response.getStatusCode();
		 * System.out.println(statusCode1);
		 */
		// RestAssured.baseURI = "https://reqres.in";
		// System.out.println(name);
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", name);
		requestParams.put("job", job);
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		//Response response = httpRequest.request(Method.POST, "/api/users");
		Response response = httpRequest.request(Method.POST, "/api/users");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);
		System.out.println(statusCode);

	}

	/*
	 * @DataProvider public Object[][] GetTestData() throws Exception {
	 * //InputStream is = this.getClass().getResourceAsStream("/testData.xlsx");
	 * FileInputStream FIS=new FileInputStream(
	 * "C:\\Users\\lenovo\\eclipse-workspace\\RestAssured\\src\\test\\java\\resources\\testData.xlsx"
	 * ); Object[][] testObjArray = Util.getTableArray(FIS, "Sheet1"); return
	 * (testObjArray); }
	 */
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "vijay";
		data[0][1] = "employye";

		data[1][0] = "vinod";
		data[1][1] = "employee1";

		data[2][0] = "haris";
		data[2][1] = "Expert";
		return data;
	}
	@DataProvider
	public Object[][] getData1() {
		Object[][] data= {{"vijay","employee"},{"vinod","employee1"},{"haris","Expert"}};
		return data;
	}
	@DataProvider
	/*public void getData2() throws IOException
	{
		FileInputStream FIS=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\RestAssured\\src\\test\\java\\testData.xlsx");
		Util ut=new Util();
		ut.datagiven(FIS);
		//return data;
	}*/
	
	public Object[][] getData2() throws IOException {
		FileInputStream FIS=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\RestAssured\\src\\test\\java\\testData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(FIS);
		//ArrayList<Object> data=new ArrayList<Object>(); 
		XSSFSheet sheet=workbook.getSheetAt(0);
		int numrows=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int numcolumn=row.getLastCellNum();
		Object data[][]=new Object[numrows][numcolumn];
		for(int i=1;i<numrows;i++)
		{
			row=sheet.getRow(i);
			for (int j=0;j<numcolumn;j++)
			{
				data[i][j]=row.getCell(j);
			}
			
		}
		System.out.println(data);
		return data;
		
	}
}
