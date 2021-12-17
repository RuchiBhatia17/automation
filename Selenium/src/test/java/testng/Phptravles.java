package testng;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Phptravles {
	WebDriver browser;
@BeforeTest
public void preconditions() {
	
	System.setProperty ("webdriver.chrome.driver", "C:\\Selenium installations\\chromedriver.exe");
 browser= new ChromeDriver();
 browser.manage().window().maximize();
	}

@Test(priority=1)
public void openurl() {
String Expected= "Login-PHPTRAVELS";
browser.manage().window().maximize();
 browser.get("https://phptravels.net/");
 
}

@Test(priority=2)
public void clicklogin() {
String Expected= "Login-PHPTRAVELS";
browser.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div/a[2]")).click();
Assert.assertEquals(browser.getTitle(), Expected);

}
@AfterTest
public void closebrowser(){
	browser.close();
}
@Test(priority=3)
public void enterusernamepassword(){
	browser.findElement(By.name("email")).sendKeys("user@phptravels.com");
	browser.findElement(By.name("password")).sendKeys("demouser");
	browser.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label")).click();
	browser.findElement(By.id("cookie_stop")).click();
	browser.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
}
@Test(priority=4)
public void clicklogout() {
	browser.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[5]/a/inull")).click();
}










}