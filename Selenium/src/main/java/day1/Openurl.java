package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium installations\\chromedriver.exe");
ChromeDriver c= new ChromeDriver();
c.get("https://www.facebook.com/");
	}

}
