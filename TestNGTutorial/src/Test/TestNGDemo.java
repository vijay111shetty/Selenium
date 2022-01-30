package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	/*
	 * Before suite
		Before test
		before class
		Before method
		main test case 1
		After method
		Before method
		main test case 2
		After method
		After class
		After test
	 */
	// pre condition starting with before
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}

	// main test case
	@Test(priority=1,groups="smoke")
	public void maintest1() {
		System.out.println("main test case 1");
	}
	@Test(priority=2,groups="regression")
	public void maintest2() {
		System.out.println("main test case 2");
	}
	@Test(priority=3,groups="retest",dependsOnMethods="maintest1")
	public void maintest3() {
		System.out.println("main test case 3");
	}
	@Test(priority=4,groups="sanity")
	public void maintest4() {
		System.out.println("main test case 4");
	}
	@Test(priority=5,groups="smoke")
	public void maintest5() {
		System.out.println("main test case 5");
	}
	// post condition annotation starting with after
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite");
	}

	

}
