package Rahulshettyacademy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportsdemo {
	ExtentReports extent;//Global variable

	@BeforeTest
	public void config()
	{
		
		String path=System.getProperty("C:\\Users\\lenovo\\eclipse-workspace\\ExtentReports")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("web automation results");
		reporter.config().setDocumentTitle("Test result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "vijay");
	}
	
	
	@Test
	public void initaldemo()
	{
		//ExtentTest test=new extent.createTest("InitialDemo");
		extent.createTest("InitialDemo");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://maven.apache.org/download.cgi");
		System.out.println(driver.getTitle());
		//test.fail("Result do not mathch");
		extent.flush();
	}
	
	
}
