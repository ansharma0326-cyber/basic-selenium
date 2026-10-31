package learning_ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class FbLoginPage {
public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Actions act=new Actions(driver);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	act.scrollByAmount(0,100).perform();
	Thread.sleep(2000);
	
	
	WebElement login=driver.findElement(By.xpath("//div/div/div/div[3]/div/div/div/div/div/div/div"));
	//act.scrollToElement(login);
	
//	TakesScreenshot tks=(TakesScreenshot) driver;
	File src=login.getScreenshotAs(OutputType.FILE);
	File des=new File("./ScreenShots/login.png");
	FileHandler.copy(src, des);
	Thread.sleep(2000);
	driver.quit();
	
}
}
