package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium installations\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.snapdeal.com/");
		c.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement computer = c.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[4]/a/span[2]"));
		Actions a = new Actions(c);
		a.moveToElement(computer).build().perform();
		WebElement computeraccessories = c.findElement(By.xpath("//*[@id=\"category4Data\"]/div[2]/div/div/p[9]/a/span"));
		a.moveToElement(computeraccessories).click().build().perform();
		WebElement rightslider = c.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[2]"));
     	a.dragAndDropBy(rightslider, -100, 0).build().perform();
     	Thread.sleep(10000);
		WebElement leftslider = c.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
		a.dragAndDropBy(leftslider, 50, 0).build().perform();
		WebDriverWait wait = new WebDriverWait(c,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(leftslider));

     	
	}

}