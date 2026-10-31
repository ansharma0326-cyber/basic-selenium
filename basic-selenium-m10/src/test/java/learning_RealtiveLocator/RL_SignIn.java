package learning_RealtiveLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RL_SignIn {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");
	driver.findElement(RelativeLocator
										.with(By.tagName("input"))
										.below(By.tagName("input"))
										).sendKeys("Anshu");

	Thread.sleep(2000);
	driver.quit();
}
}
