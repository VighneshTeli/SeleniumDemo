package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo{
	public static void main(String[] args) throws InterruptedException
	{
		KeyBoardHandle();
	}
	
	public static void KeyBoardHandle() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement userName = driver.findElement(By.id("txtUsername"));
		Actions actions = new Actions(driver);
		actions.moveToElement(userName).click()
		.keyDown(Keys.SHIFT)
		.sendKeys("a")
		.keyUp(Keys.SHIFT)
		.sendKeys("dmin")
		.build().perform();
		actions.moveToElement(driver.findElement(By.id("txtPassword")));
		Thread.sleep(3000);
		driver.quit();
		
	}
}