package learningJSE;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JseHw {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.location='https://automationwithpiyush.vercel.app/js-executor.html'");
	Thread.sleep(2000);

	WebElement Input = driver.findElement(By.id("display-text"));
	jse.executeScript("document.getElementById('display-text').value='Anshu'");
	jse.executeScript("arguments[0].value='Anshu'",Input);
	Thread.sleep(2500);
	
	jse.executeScript("window.scrollBy(0,800)");
	Thread.sleep(2000);
	
	WebElement check = driver.findElement(By.id("download-report-btn"));
	jse.executeScript("arguments[0].click();",check);
	
	Thread.sleep(5000);
	driver.quit();
}
}
