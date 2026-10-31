package learningJSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DocumentJse {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	
		jse.executeScript("window.location='https://automationwithpiyush.vercel.app/locatorsSignin.html'");
		jse.executeScript("window.scrollBy(0.200)");
		
		jse.executeScript("document.getElementById('email').value='Anshu Sharma'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('password').value='Anshu123'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('terms_checkbox').click()");
		Thread.sleep(2000);
		jse.executeScript("document.getElementsByClassName('w-full')[0].click()");
		
		
		Thread.sleep(2000);
		driver.quit();
		
}
}