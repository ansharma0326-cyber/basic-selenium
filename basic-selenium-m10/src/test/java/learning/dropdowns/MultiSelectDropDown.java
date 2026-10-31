package learning.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
	
	//create webelement ref for dd elememt 
	WebElement MultiSelectdd = driver.findElement(By.id("multi-select"));
	
	// create object of select class
	Select msdd = new Select(MultiSelectdd);
	
	//perform tasks 
	msdd.selectByIndex(1);
	Thread.sleep(1000);
	
	msdd.selectByValue("git");
	Thread.sleep(1000);
	
	msdd.selectByVisibleText("TestNG");
	Thread.sleep(1000);
	
	// select for all options 
	//List<WebElement> options = msdd.getOptions();
	//for(WebElement i : options) {
		//System.out.println(i.getText());
		//Thread.sleep(1000);
	//}
	
	WebElement firstSelected = msdd.getFirstSelectedOption();
	System.out.println(firstSelected.getText());
	Thread.sleep(1000);
	
	msdd.deselectByIndex(1);
	Thread.sleep(1000);
	
	msdd.deselectByValue("testng");
	Thread.sleep(1000);
	
	msdd.deselectByVisibleText("Git");
	Thread.sleep(2000);
	
	List<WebElement> AllSelected = msdd.getAllSelectedOptions();
	for (WebElement i : AllSelected) {
	System.out.println(i.getText());
	}
	Thread.sleep(1000);
	
	msdd.deselectAll();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	driver.quit();
}
}
