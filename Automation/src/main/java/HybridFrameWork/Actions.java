package HybridFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static WebDriver driver;

	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void navigate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/index.php");

	}

	public static void input_Username() {
		driver.findElement(By.name("userName")).sendKeys("vijay");
	}

	public static void input_Password() {
		driver.findElement(By.name("password")).sendKeys("vijay123");
	}

	public static void click_Login() throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	}

	@Test
	public static void verify_Login() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Login: Mercury Tours");
		System.out.println(pageTitle);
	}

	public static void closeBrowser() {
		driver.quit();
	}
}
