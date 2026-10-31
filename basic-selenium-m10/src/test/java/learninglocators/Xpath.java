package learninglocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationwithpiyush.vercel.app/locators.html");
		
		WebElement navigate = driver.findElement(By.xpath("//p[text()='Navigation Point']"));
		navigate.click();
		
		WebElement Searchquery = driver.findElement(By.xpath("//input[@aria-label='search-query']"));
		Searchquery.sendKeys("how are you?");
		
		WebElement ReportReady = driver.findElement(By.xpath("//button[text()='Generate Report']"));
		ReportReady.click();
		
		WebElement Contactemail = driver.findElement(By.xpath("//input[@name='contact_email']"));
		Contactemail.sendKeys("ansharma0326@gamil.com");
		
		WebElement SubmitOrder = driver.findElement(By.xpath("//button[text()='Submit Order 2026']"));
		SubmitOrder.click();
		
		WebElement Checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Checkbox1.click();//first
		
		WebElement Checkbox2 = driver.findElement(By.xpath("//input[@name='user_check']"));
		Checkbox2.click();
		
		WebElement Editbtn1 = driver.findElement(By.xpath("(//button[@class='edit-btn'])[1]"));
		Editbtn1.click();
		
		WebElement Editbtn2 = driver.findElement(By.xpath("(//button[@class='edit-btn'])[2]"));
		Editbtn2.click();
		
		
		Thread.sleep(10000);
		driver.quit();
	}

}
