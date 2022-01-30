package Testcases;

import objectrepository.rediffloginpage;

public class loginapplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "path");
		WebDriver driver=new ChromeDriver();
		driver.get("url");
		rediffloginpage rd=new rediffloginpage(driver);
		rd.Emailid().sendKeys("sdfs");
		rd.passwords().sendKeys("sfad");
		rd.buttonclick().click();
		
	}

}
