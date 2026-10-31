package learning_ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Swiggy {
public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.swiggy.com//");
	Thread.sleep(1000);
	
	TakesScreenshot tks =  (TakesScreenshot) driver;
	
	File src = tks.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShots/Swiggy.png");
	
	FileHandler.copy(src, dest);
	
	Thread.sleep(2000);
	driver.quit();
	
}
}
