package seleniumconcepts;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().fullscreen();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("madhan2600@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234");
		
		WebElement log_btn = driver.findElement(By.id("u_0_b"));
		log_btn.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concepts\\Screenshot.facebook.png");
		FileUtils.copyFile(source, destination);
		
	}

}
