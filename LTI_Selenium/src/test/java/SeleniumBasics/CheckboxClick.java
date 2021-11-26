package SeleniumBasics;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
////		System.out.println(driver.getPageSource());
//		System.out.println(driver.getTitle());
//		driver.getAttribute();
//		driver.getWindowHandle();
//		Set<String> handles = driver.getWindowHandles();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("EricTriston");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_43\"]")).click();
	}

}
