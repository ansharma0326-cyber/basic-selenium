package learningJSE;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSE3 {
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
	Thread.sleep(1000);
	driver.quit();
}
}
