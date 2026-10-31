package learningJSE;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSE2 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	
	// isme hmne apne jse vale sare fqp ko url1 m store kra diya h or frr str m url1 ko store krake srf us vale ko print kra diya h 
	
	//jse.executeScript("window.location='https://automationwithpiyush.vercel.app/locatorsSignin.html'");
	//jse.executeScript("window.location='https://facebook.com/;'");
  //jse.executeScript("window.location='https://www.instagram.com/'");
	String url1 = "https://automationwithpiyush.vercel.app/locatorsSignin.html";
	Thread.sleep(2000);
	String url2 = "https://facebook.com/";
	Thread.sleep(2000);
	String url3 = "https://www.instagram.com/";
	Thread.sleep(2000);
	
	String str="window.location='"+url1+"';";
	System.out.println(str);
	jse.executeScript(str);
	driver.quit();
}
}
