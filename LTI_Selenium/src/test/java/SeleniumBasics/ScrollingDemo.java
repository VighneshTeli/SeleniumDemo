package SeleniumBasics;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ScrollingDemo {
 
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"e85c8137-c50d-4a10-9347-11d24f8acbe7\"]/div[2]/div/ul/li[3]/span/a/img"));
        js.executeScript("arguments[0].scrollIntoView();",element);
        driver.quit();
    }
}