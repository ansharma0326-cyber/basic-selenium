package learningJSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDK {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.location='https://www.oracle.com/java/technologies/javase-jdk26-doc-downloads.html'");
	Thread.sleep(1000);
	
	jse.executeScript("window.scrollBy(100,100)");
	Thread.sleep(2000);
	
	WebElement Download = (WebElement) driver.findElement(By.className("license-link"));
	jse.executeScript("arguments[0].click();",Download);
	Thread.sleep(2000);
	
	WebElement DownloadBtn = (WebElement) driver.findElement(By.xpath("//a[@class='download-file icn-download']"));
	jse.executeScript("arguments[0].click();",DownloadBtn);
	
	Thread.sleep(20000);
	driver.quit();
}
}
