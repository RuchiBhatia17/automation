package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium installations\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://register.rediff.com/register/register.php?FormName=user_details");
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("hello");
		c.get("http://register.rediff.com/register/register.php?FormName=user_details");
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Hi");
	}

}
