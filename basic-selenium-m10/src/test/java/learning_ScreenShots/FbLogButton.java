package learning_ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FbLogButton {
public static void main(String[] args) throws IOException, InterruptedException {
	 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    
     driver.get("https://www.facebook.com/");
     Thread.sleep(4000);
	 
     WebElement FbLogButton = driver.findElement(By.cssSelector("div[aria-label=\"Log in\"]"));
	
   //  TakesScreenshot tks = (TakesScreenshot) driver;
	File src = FbLogButton.getScreenshotAs(OutputType.FILE);
	File dest = new File ("./ScreenShots/FbLogButton.png");
	FileHandler.copy(src, dest);
	
	Thread.sleep(2000);
	driver.quit();
}
}
