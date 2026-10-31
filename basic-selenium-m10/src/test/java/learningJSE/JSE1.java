package learningJSE;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSE1 {
	
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	// isme hmne phle driver ki help se fully qualified path diya h or frr jse ki help e 
	
	//driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");
	jse.executeScript("window.location='https://automationwithpiyush.vercel.app/locatorsSignin.html'");
	Thread.sleep(2000);
	
	//driver.get("https://facebook.com/");
	jse.executeScript("window.location='https://facebook.com/;'");
	Thread.sleep(2000);
	
	//driver.get("https://www.instagram.com/");
	jse.executeScript("window.location='https://www.instagram.com/'");
	Thread.sleep(2000);
	
	driver.quit();
}
}
