package Learning_iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class W3cSchool {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	
	driver.switchTo().frame("iframeResult");
	
	WebElement Cars = driver.findElement(By.id("cars"));
	Select selMultiple = new Select(Cars);
	
   selMultiple.selectByValue("volvo");
   Thread.sleep(1000);
   
   selMultiple.selectByVisibleText("Saab");
   Thread.sleep(1000);
   
   selMultiple.selectByIndex(3);
   
   WebElement submit = driver.findElement(By.cssSelector("input[value='Submit']"));
   submit.click();

	Thread.sleep(2000);
	driver.quit();
}
}
