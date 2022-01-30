package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	
		@Test(groups= {"smoke"})
		public void testccc()
		{
			System.out.println("good");
		
		}
		@AfterSuite
		public void aftersuites()
		{
			System.out.println("I will be executed after suite");
		}
		@BeforeTest
		public void prerequist()
		{
			System.out.println("I will be executed first");
		}

}
