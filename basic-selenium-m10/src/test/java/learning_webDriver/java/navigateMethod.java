package learning_webDriver.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		Navigation nav = driver.navigate();
		nav.to("https://x.com/");
		Thread.sleep(1000);
		
		nav.back();
		Thread.sleep(1000);
		
		nav.forward();
		Thread.sleep(1000);
		
		nav.refresh();
		Thread.sleep(4000);
		
		
	}

}
