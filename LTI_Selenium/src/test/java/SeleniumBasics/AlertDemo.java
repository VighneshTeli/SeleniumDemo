package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("alert")).click();
		Thread.sleep(3000);// 3 sec delay
		
		String actual_msg = driver.switchTo().alert().getText();
		String expected_msg = "Please share this website with your friends and in your organization.";
		if(actual_msg.equals(expected_msg))
			System.out.println("Test Case Passed");
		else
			System.out.println("Test case Failed");
		
		driver.switchTo().alert().accept();
	}

}
