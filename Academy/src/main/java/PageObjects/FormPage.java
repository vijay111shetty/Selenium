package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
	WebDriver driver;

	public FormPage(WebDriver driver) {
		this.driver = driver;
	}

	By name = By.xpath("//div[@class='form-group']//input[@name='name']");
	By email = By.cssSelector("input[name='email']");
	By password = By.cssSelector("input[placeholder='Password']");
	By bday = By.cssSelector("input[name='bday']");
	By msg = By.cssSelector(".alert.alert-success.alert-dismissible");
	By but = By.cssSelector("input[type='submit']");

	public WebElement namePlace() {
		return driver.findElement(name);
	}

	public WebElement emailPlace() {
		return driver.findElement(email);
	}

	public WebElement passwordPlace() {
		return driver.findElement(password);
	}

	public WebElement DOBirth() {
		return driver.findElement(bday);
	}

	public WebElement message() {
		return driver.findElement(msg);
	}

	public WebElement button() {
		return driver.findElement(but);
	}
}
