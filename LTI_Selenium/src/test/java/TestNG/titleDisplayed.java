package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class titleDisplayed {
	WebDriver driver;
	@BeforeMethod
	public void setUp( ) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void vaidateUsername()
	{
		boolean userName = driver.findElement(By.id("txtUsername")).isDisplayed();
		AssertJUnit.assertTrue(userName);
	}
	
	@Test
	public void validateTitle()
	{
		boolean title = driver.getTitle().contains("OrangeHRM");
		AssertJUnit.assertTrue(title);
	}
	
	@Test
	public void validatePaneltxt()
	{
		boolean paneltxt = driver.findElement(By.id("logInPanelHeading")).isDisplayed();
		AssertJUnit.assertTrue(paneltxt);
	}
	
	@Test
	public void validateRecord()
	{
		boolean res= false;
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Ajay");
		driver.findElement(By.id("searchBtn")).click();
		boolean text=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td")).isDisplayed();
		System.out.println("No record Found");
		Assert.assertTrue(text);
	}

	@Test
	public void recordDisplay()
	{
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aravind");
		driver.findElement(By.id("searchBtn")).click();
	 boolean text2=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).isDisplayed();
	 Assert.assertTrue(text2);
	 System.out.println(" got the result....");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
