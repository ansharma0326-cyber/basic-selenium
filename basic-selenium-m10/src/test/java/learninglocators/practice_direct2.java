package learninglocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_direct2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");
	
	WebElement Username =  driver.findElement(By.id("email"));
    Username.sendKeys("Anshu Sharma");
    
    WebElement Password =  driver.findElement(By.id("password"));
    Password.sendKeys("anshu@2004");
    
    WebElement checkbox  =  driver.findElement(By.id("terms_checkbox"));
    checkbox.click();

    WebElement submit  =  driver.findElement(By.xpath("//button[@type='submit']"));
    submit.click();
    
    Thread.sleep(7000);
	driver.quit();
}

	
}

