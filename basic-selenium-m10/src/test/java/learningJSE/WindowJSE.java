package learningJSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowJSE{
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	jse.executeScript("window.location='https://www.zomato.com/'");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,500)");//relative
	Thread.sleep(2000);
	jse.executeScript("window.scrollTo(0,200)");//absolute
	Thread.sleep(2000);
	
	
	Thread.sleep(2000);
	driver.quit();
}
}
