package learning.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
	
	//create web element ref for dropdown element
	 WebElement singleselectdd = driver.findElement(By.id("single-select"));
		
	 // create object of select class
	 Select ssdd = new Select(singleselectdd);
	 
	 //performing task 
	 ssdd.selectByIndex(2);//Index starts from 1 not from 0
	 Thread.sleep(1000);
	 
	 ssdd.selectByValue("in");
	 Thread.sleep(1000);
	 
	 ssdd.selectByVisibleText("United States");
	 Thread.sleep(1000);
	 
	List<WebElement> options= ssdd.getOptions();
		for (WebElement i :options) {
			System.out.println(i.getText());
			Thread.sleep(1000);
		}
	 
	 boolean country = ssdd.isMultiple();
	 if (country) {
		 ssdd.deselectAll();
	 }
	 
	Thread.sleep(2000);
	driver.quit();
}
}
