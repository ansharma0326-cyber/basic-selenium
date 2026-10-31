package learning_webDriver.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_getmethods {public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(5000);
	
	driver.get("https://www.amazon.com/");
	
	String title = driver.getTitle();
			System.out.println(title);
	
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			String Sourcecode = driver.getPageSource();
			System.out.println(Sourcecode);
			Thread.sleep(5000);
			
			driver.close();
			
			driver.quit();
			
}


}
