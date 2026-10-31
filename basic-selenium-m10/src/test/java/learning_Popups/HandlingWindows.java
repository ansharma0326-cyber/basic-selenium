package learning_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	driver.get("https://automationwithpiyush.vercel.app/");
	
	//Step1 - Get the home Address
	String PA = driver.getWindowHandle();
	
	//Step2 - Perform the task which will be open the new tab's or windows 
	driver.findElement(By.cssSelector("button[onclick=\"openSocialChannels()\"]")).click();
	
	//Step3 - Get the session Id of all windows or tabs 
	Set<String> CA = driver.getWindowHandles();
	
	//Step 4 - switch to each and every tabs 
	for(String i :CA) {
		driver.switchTo().window(i);
		//Step5 -Break the loop whenever the condition meets or satisfied
		if(driver.getCurrentUrl().contains("linkedin"))
			break;
	}
	//Step6 - Perform the task 
	driver.findElement(By.id("email-or-phone")).sendKeys("anshu@123.com");
	Thread.sleep(4000);
	driver.close();
	
	//Step7 - Back to home 
	driver.switchTo().window(PA);
	
	Thread.sleep(2000);
	driver.quit();
}
}
