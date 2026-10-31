package QSpiderForm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSPformPractice {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(2000);
	
	WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Enter your name']"));
	Name.sendKeys("Anshu Sharma ");
	Thread.sleep(2000);
	
	WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']"));
	Email.sendKeys("anshu@gmail.com");
	Thread.sleep(2000);
	
	WebElement Pass = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
	Pass.sendKeys("1234566789");
	Thread.sleep(2000);
	
	WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
	Submit.click();
	
	
	Thread.sleep(2000);
	driver.quit();
}
}
