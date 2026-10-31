package learninglocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_direct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationwithpiyush.vercel.app/signup.html");

		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Anshu");

		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Sharma");

		WebElement day = driver.findElement(By.id("day"));
		day.sendKeys("7");

		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("dec");

		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("2004");

		WebElement Female = driver.findElement(By.cssSelector("input[name='sex'][value='1']"));
		Female.click();

		WebElement Male = driver.findElement(By.cssSelector("input[name='sex'][value='2']"));
		Male.click();

		WebElement Custom = driver.findElement(By.cssSelector("input[name='sex'][value='1']"));
		Custom.click();

		WebElement reg_email__ = driver.findElement(By.name("reg_email__"));
		reg_email__.sendKeys("ansharma0326@gmail.com");

		WebElement reg_passwd__ = driver.findElement(By.name("reg_passwd__"));
		reg_passwd__.sendKeys("anshu@2004");

		//WebElement signUp = driver.findElement(By.cssSelector("button[type='submit']"));
		//signUp.click();
		
		WebElement signup = driver.findElement(By.xpath("//button[normalize-space(text())='Sign Up']"));
		signup.click();
		
		WebElement link = driver.findElement(By.cssSelector("a.text-accent"));
		link.click();
		
		Thread.sleep(7000);
		driver.quit();
	}

}
