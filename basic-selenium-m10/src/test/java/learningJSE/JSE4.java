package learningJSE;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSE4 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	String url1 = "https://automationwithpiyush.vercel.app/locatorsSignin.html";
	Thread.sleep(2000);
	String url2 = "https://facebook.com/";
	Thread.sleep(2000);
	String url3 = "https://www.instagram.com/";
	Thread.sleep(2000);

	// ye line srf url1 ko browser m bhejri h baki sb bss store ho rhe h url 2,3 m
	jse.executeScript("window.location=arguments[0];", url1);
	Thread.sleep(2000);
	
//  jse.executeScript("window.location=arguments[0];", url2);
//	Thread.sleep(1000);
//	jse.executeScript("window.location=arguments[0];", url3);
	
	// ab hm is running url k andr details fill krenge je ki help se 
	WebElement username = driver.findElement(By.id("email"));
	jse.executeScript("document.getElementById('email').value='Anshu'");
	jse.executeScript("arguments[0].value='admin'", username);
	
	WebElement check = driver.findElement(By.id("terms_checkbox"));
	jse.executeScript("arguments[0].click();", check);
//	Thread.sleep(1000);

	jse.executeScript("window.scrollBy(0, 500);");
	
	Thread.sleep(1000);
	driver.quit();
}
}
