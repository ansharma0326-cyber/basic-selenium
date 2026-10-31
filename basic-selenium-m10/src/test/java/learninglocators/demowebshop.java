package learninglocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	WebElement poor = driver.findElement(By.xpath("//label[text()='Poor']/preceding-sibling::input"));
	poor.click();
	
	WebElement Vote = driver.findElement(By.xpath("//input[@value='Vote']"));
	Vote.click();
	
	Thread.sleep(5000);
	driver.quit();
}
}