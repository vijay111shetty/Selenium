package DataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTExcel {
WebDriver driver;
	
	@Test(dataProvider="getData")
	public void demoproject(String username,String password) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		System.out.println("Login successful");
		
	}
	@AfterMethod
	public void ProgramTermination() {
		driver.quit();
	}

	@DataProvider
	public Object[][] getData() {
		ReadExcelFile config=new ReadExcelFile("C:\\Users\\lenovo\\eclipse-workspace\\Automation\\ExcelFile.xlsx");
		int rows=config.getRowCount(0);
		Object[][] credentials=new Object[rows][2];
		for(int i=0;i<rows;i++) {
			credentials[i][0]=config.getData(0, i, 0);
			credentials[i][1]=config.getData(0,i,1);
		}
		return credentials;
	}

}
