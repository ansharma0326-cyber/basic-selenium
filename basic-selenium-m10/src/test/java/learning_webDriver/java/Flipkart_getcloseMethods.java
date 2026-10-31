package learning_webDriver.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_getcloseMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String Sourcecode = driver.getPageSource();
	    System.out.println(Sourcecode);
		
		driver.close();
		
		driver.quit();
		
	}

}
