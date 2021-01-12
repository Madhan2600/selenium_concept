package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.get("https://www.facebook.com/r.php");
		
		
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("madhan2600@gmail.com");
//		String name = email.getAttribute("value");
//		System.out.println("value in the text box =" +name);
//		
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
//		pass.sendKeys("1234");
//		String password = pass.getAttribute("value");
//		System.out.println("value in the text box =" +password);
//		
//		
//		WebElement create_btn = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti ')]"));
//		create_btn.click();
		
		WebElement drop_down = driver.findElement(By.id("day"));
		Select s = new Select(drop_down);
		s.selectByIndex(3);
		
//		Thread.sleep(3000);
		s.selectByValue("30");
		
		
	}
}