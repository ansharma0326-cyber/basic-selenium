package Learning_ShadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQSP {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
	Thread.sleep(1000);
	
	//Locate or Get the  accces the shadow host by driver
		WebElement ShadowHost = driver.findElement(By.xpath("//div[@class='my-3']//preceding-sibling::div"));
		
		//Get the ShadowRoot by ShadowHost
		SearchContext ShadowRoot = ShadowHost.getShadowRoot();
		
		//Get the acces of element isnside ShadowRoot
		WebElement Password = ShadowRoot.findElement(By.cssSelector("input[placeholder='Enter your username']"));
		Password.sendKeys("ANSHU");
	
		Thread.sleep(2000);
		
	//Locate or Get the  accces the shadow host by driver
	WebElement ShadowHost1 = driver.findElement(By.xpath("//div[@class='my-3']//following-sibling::div"));
	
	//Get the ShadowRoot by ShadowHost
	SearchContext ShadowRoot1 = ShadowHost1.getShadowRoot();
	
	//Get the acces of element isnside ShadowRoot
	WebElement Username = ShadowRoot1.findElement(By.cssSelector("input[placeholder='Enter your password']"));
	Username.sendKeys("1234ANSH");
	
	Thread.sleep(2000);
	
}
}
