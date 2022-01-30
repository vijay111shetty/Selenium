package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day1 {
	@BeforeClass
	public void beforeclassm() {
		System.out.println("before the execution any  in the class");
	}

	@BeforeSuite
	public void beforesuites() {
		System.out.println("I wull be executed before the suite");
	}

	@Test(groups = { "smoke" })
	public void Demo() {
		System.out.println("vijay");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("I will be execute before the each and every method in this class only");
	}

	@Parameters({ "URL" ,"URL2"})
	@Test
	public void testcase2(String urlname1,String urlname2) {
		System.out.println("Shetty");
		System.out.println(urlname1);
		System.out.println(urlname2);
	}
	
	@Test(dataProvider="getdata")
	public void Datareq(String username,String password)
	{
		//executes for three times
		System.out.println(username);
		System.out.println(password);
	}

	@AfterTest
	public void Postrequest() {
		System.out.println("I will be executed last");
	}

	@AfterMethod
	public void afterthemethod() {
		System.out.println("I will be execute aftert the each and every method in this class only");
	}
	
	
	@DataProvider
	public Object[][] getdata()
	{
		//1st combition set of data
		//2nd combition set of data
		//3rd combition set of data
		//the test should be invoke three times and is should be executed
		Object[][] data=new Object[3][2];//3--rows  2--columns
		data[0][0] = "username1";
		data[0][1] = "password1";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		
		return data;
 	}
	
}
