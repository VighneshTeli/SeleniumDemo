package SeleniumBasics;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEditorApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		driver.switchTo().frame(0);
		
		// when there are more than on frame
//		WebElement frame = driver.findElement(By.id("mce_0_ifr"));
//		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Vighnesh");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		
		driver.quit();
		
		
	}

}
