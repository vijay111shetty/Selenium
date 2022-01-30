package objectrepository;

public class rediffloginpage {
	Webdriver driver;

	public rediffloginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * By username=By.xpath("...."); By password=By.css("...."); By
	 * button=By.css("...");
	 */

	/*
	 * public WebElement Emailid() { return driver.findElement(username); } public
	 * WebElement passwords() { return driver.findElement(password); } public
	 * WebElement buttonclick() { return driver.findElemrnt(button); }
	 */
	// In page object factory
	@FindBy(xpath == " ")
	WebElement username;
	@FindBy(xpath == " ")
	WebElement password;
	@FindBy(xpath == " ")
	WebElement button;

	public WebElement Emailid() {
		return username;
	}

	public WebElement passwords() {
		return password;
	}

	public WebElement buttonclick() {
		return button;
	}
}
