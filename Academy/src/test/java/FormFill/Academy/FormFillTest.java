package FormFill.Academy;

import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import PageObjects.FormPage;
import Resources.ReadExcel;
import Resources.base;

public class FormFillTest extends base {
	public WebDriver driver;

	@BeforeTest
	public void initilizes() throws IOException {
		driver = initializeDriver();
	}

	@Test(dataProvider = "getData1")
	public void testing(String name, String email, String password, String gender, String date) {
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FormPage FP = new FormPage(driver);
		FP.namePlace().sendKeys(name);
		FP.emailPlace().sendKeys(email);
		FP.passwordPlace().sendKeys(password);
		WebElement gen = driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		selectdropdown(gen, gender);
		FP.DOBirth().sendKeys(date);
		FP.button().click();
		System.out.println(FP.message().getText());

	}

	@AfterTest
	public void closing() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData1() {
		Object[][] data = new Object[2][5];
		data[0][0] = "vijay";
		data[0][1] = "vijay111shetty";
		data[0][2] = "1234";
		data[0][3] = "Male";
		data[0][4] = "03101995";

		data[1][0] = "vinod";
		data[1][1] = "vinod111shetty";
		data[1][2] = "4321";
		data[1][3] = "Male";
		data[1][4] = "10031995";

		return data;
	}
//	@DataProvider
//	public Object[][] getData1() {
//		ReadExcel config=new ReadExcel("C:\\Users\\lenovo\\eclipse-workspace\\Academy\\Data11.xlsx");
//		int rows=config.getRowcount(0);
//		Object[][] credentials=new Object[rows][5];
//		for(int i=1;i<rows;i++) {
//			credentials[i][0]=config.getData(0, i, 1);
//			credentials[i][1]=config.getData(0,i,2);
//		}
//		return credentials;
//	}

}
