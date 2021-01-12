package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(3000);
	
	//WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	//email.sendKeys("madhan2600@gmail.com");
	
	driver.findElement(By.id("email")).sendKeys("madhan2600@gmail.com");
	
	WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
	pass.sendKeys("1234");
	
	WebElement btn= driver.findElement(By.xpath("//button[contains(@class,'_4jy6 _4jy1 selected _51sy')]"));
	btn.click();
	
}
}
