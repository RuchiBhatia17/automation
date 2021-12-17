package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchoEcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium installations\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("https://echoecho.com/htmlforms09.htm");
		c.findElement(By.name("checkbox")).click();
		c.findElement(By.name("option2")).click();
	}

}
