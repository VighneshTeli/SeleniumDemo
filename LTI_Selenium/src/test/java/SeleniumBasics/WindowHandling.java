package SeleniumBasics;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println(driver.getTitle());
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window id is "+parentWindow);
		driver.findElement(By.id("button1")).click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String str:handles)
		{
			//System.out.println(str);
		}
		
		//identified both the parent and child ids
		Iterator<String> it = handles.iterator();
		it.next();
		String childWindow = it.next();
		System.out.println("Child window is "+childWindow);
		
		
		//switching between windows
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}





//package SeleniumBasics;
//
//
//
//import java.util.Iterator;
//
//import java.util.Set;
//
//
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//
//public class WindowHandling {
//
//
//
//public static void main(String[] args) {
//
//WebDriverManager.chromedriver().setup();
//
//WebDriver driver = new ChromeDriver();
//
//driver.get("http://www.seleniumframework.com/Practiceform/");
//
//System.out.println(driver.getTitle());
//
////1 window
//
//String parentWindow = driver.getWindowHandle();
//
//System.out.println("Parent window id is " + parentWindow);
//
//driver.findElement(By.id("button1")).click();
//
////2 windows
//
//Set<String> handles =  driver.getWindowHandles();
//
//for (String string : handles) {
//
////System.out.println(string);
//
//}
//
// 
//
////identified both the parent and child window ids
//
//Iterator<String> it = handles.iterator();
//
//it.next();
//
//String childWindow = it.next();
//
//System.out.println("Child Window id is "+ childWindow);
//
// 
//
// 
//
////switching between windows
//
//driver.switchTo().window(childWindow);
//
// 
//
//System.out.println(driver.getTitle());
//
//driver.switchTo().window(parentWindow);
//
//System.out.println(driver.getTitle());
//
// 
//
////quit and close
//
////quit: will close all the open windows
//
////close: will only close the window pointed by driver
//
////driver.quit();
//
//driver.close();
//
//}
//
//}
