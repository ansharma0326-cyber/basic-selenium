package LearningSpecialPath;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SpecialPath {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.instagram.com/?hl=en");
	
	Actions act = new Actions(driver);
	act.scrollByAmount(0,200).build().perform();
	Thread.sleep(2000);
	
	WebElement English = driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Down chevron icon']"));
	act.click(English).perform();
	System.out.println("Language menu opened successfully");
	
	//changing lang eng to hindi after clicking on arrow 
	//act.scrollByAmount(0,200).build().perform();
	//Thread.sleep(1000);
	//Select select = new Select(driver.findElement(By.id("Language")));
    //select.selectByVisibleText("हिन्दी");
	 
	Thread.sleep(2000);
	driver.quit();
}
}
