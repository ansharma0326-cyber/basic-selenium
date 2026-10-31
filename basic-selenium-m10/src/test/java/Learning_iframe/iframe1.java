package Learning_iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe1 {
public static void main(String[] args) throws InterruptedException {
	 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/frames.html");
	
	driver.switchTo().frame(3);
	driver.switchTo().frame(0);
	driver.findElement(By.id("notes_area")).sendKeys("....Now Detected");
	
	driver.switchTo().frame(0);
	driver.switchTo().frame(0);
	driver.findElement(By.id("secret_code")).sendKeys("ansh123");
	Thread.sleep(1500);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("name_input")).sendKeys("Anshu Sharma");
	Thread.sleep(1000);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
	driver.findElement(By.id("critical_check")).click();
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(2);
	WebElement BloodType = driver.findElement(By.cssSelector("input[value='A+']"));
	BloodType.click();
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(4);
	driver.findElement(By.id("presc_date")).sendKeys("07-12-2004");
	Thread.sleep(1000);
	
	driver.switchTo().defaultContent();
	
	
	Thread.sleep(2000);
	driver.quit();
}
}
