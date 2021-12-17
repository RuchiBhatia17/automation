package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	@Test
	public void testcase() {
	System.out.println("1st Test case");
	}
@BeforeTest
public void preconditions() {
	System.out.println("Before test");
}
@AfterTest
public void postconditions() {
System.out.println("After Test");
}
@BeforeClass
public void preexecution() {
	System.out.println("Before Class");
}
@AfterClass
public void postexecution() {
	System.out.println("After class");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("Before method");
}
@AfterMethod
public void aftermethod() {
	System.out.println("After method");
}
@BeforeSuite
public void presuite() {
System.out.println("Before suite");
}
@AfterSuite
public void postsuite() {
	System.out.println("After suite");
}
}