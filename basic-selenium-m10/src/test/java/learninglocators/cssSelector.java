package learninglocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationwithpiyush.vercel.app/locators.html");

		WebElement EmployeeID = driver.findElement(By.cssSelector("#employee-id-input"));
		EmployeeID.sendKeys("123456");
		
		WebElement Status = driver.findElement(By.cssSelector(".verify-status-btn"));
		Status.click();
		
		WebElement paragraphs = driver.findElement(By.cssSelector(".parent-wrapper>.target-child"));
		paragraphs.click();
		
		WebElement paragraph = driver.findElement(By.cssSelector(".inner-wrapper>.target-child"));
		paragraph.click();
		
		WebElement Accesscode = driver.findElement(By.cssSelector("input[data-role='admin-access']"));
		Accesscode.sendKeys("@2004");
		
		Thread.sleep(5000);
		driver.quit();


}}
