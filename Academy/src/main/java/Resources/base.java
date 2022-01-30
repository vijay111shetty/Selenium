package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		// WebDriver driver=new ChromeDriver();
		// driver = new ChromeDriver();
		prop = new Properties();
		FileInputStream FIS = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\Academy\\src\\main\\java\\Resources\\data.properties");
		prop.load(FIS);
		String browsername = prop.getProperty("browsername");
		if (browsername.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();//--->requires webdriver manager dependency
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			

		} else if (browsername.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public void getscreenshot(String Testcasename, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\reports\\" + Testcasename + ".png";
		FileUtils.copyFile(source, new File(destination));
	}

	public void selectdropdown(WebElement locator, String text) {
		Select dropdown = new Select(locator);
		dropdown.selectByVisibleText(text);
	}
}
