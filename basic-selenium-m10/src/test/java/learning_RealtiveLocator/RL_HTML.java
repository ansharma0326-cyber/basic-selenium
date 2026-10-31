package learning_RealtiveLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RL_HTML {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/relative.html");
	Thread.sleep(2000);
	driver.findElement(RelativeLocator
									.with(By.tagName("button"))
									.toLeftOf(By.id("cell_top_center"))
									.above(By.id("center_monitor"))
									.above(By.id("cell_bot_center"))
									.toLeftOf(By.id("cell_bot_right"))
			).click();
	Thread.sleep(2000);
	driver.quit();
	
}
}
