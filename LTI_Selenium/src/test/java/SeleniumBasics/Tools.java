package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://demoqa.com/alerts");
		
		//1
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		
//		//2
//		driver.findElement(By.id("timerAlertButton")).click();
////		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		
		//3
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
//		
		//4
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Vighnesh");
		driver.switchTo().alert().accept();
		
//		driver.quit();
		
	}

}
