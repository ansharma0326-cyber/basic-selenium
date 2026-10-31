package learning.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://automationwithpiyush.vercel.app/actions.html");
	 
	 Actions act = new Actions(driver);
	 Thread.sleep(2000);
	 
	 //left.click
	 WebElement LC = driver.findElement(By.id("click-box"));
	// act.moveToElement(LC).click().build().perform();
	 act.click(LC).perform();
	 Thread.sleep(2000);
	 
	 //RIght click 
	 WebElement RC = driver .findElement(By.id("right-click-area"));
	 //act.moveToElement(RC).click().build().perform();
	 act.contextClick(RC).perform();
	 Thread.sleep(2000);
	 
	 //Double click 
	 WebElement DC = driver.findElement(By.id("double-click-area"));
	 // act.moveToElement(DC).click().build().perform();
	 act.doubleClick(DC).perform();
	 Thread.sleep(2000);
	 
	 //click&hold 
	 WebElement clickNDhold = driver.findElement(By.id("click-hold"));
	 //act.moveToElement(clickNDhold).click().build().perform();
	 act.clickAndHold(clickNDhold).perform();
	 Thread.sleep(5000);

	 //release
	 act.release().build().perform();
	 
	 //drag nd drop 
	 WebElement laptop = driver.findElement(By.id("prod-laptop"));
	 WebElement iPhone = driver.findElement(By.id("prod-phone"));
	 WebElement Watch = driver.findElement(By.id("prod-watch"));
	 WebElement Headset = driver.findElement(By.id("prod-headphones"));
	 
	 WebElement dest = driver.findElement(By.id("shelf-zone"));
	 
	act.dragAndDrop(laptop, dest).build().perform();
	Thread.sleep(1000);
	act.dragAndDrop(iPhone, dest).build().perform();
	Thread.sleep(1000);
	
	act.dragAndDropBy(Watch, 200, 0).build().perform();
	Thread.sleep(1000);
	act.dragAndDropBy(Headset, 300, 0).build().perform();
	Thread.sleep(1000);
	
	//scroll
	
	WebElement footer = driver.findElement(By.xpath("p[contains(text(), 'AutomationWithPiyush')])"));

//	act.scrollToElement(footer).build().perform();
	act.scrollByAmount(0, 300).build().perform();
	Thread.sleep(1000);
	act.scrollByAmount(0, 300).build().perform();
	Thread.sleep(1000);
	act.scrollByAmount(0, 300).build().perform();
	Thread.sleep(1000);
	
//	seekbar/slider
//	moveToElement(element)
//	moveByOffset(x, y)
//	click()
	
	Thread.sleep(1000);
	
	WebElement slider = driver.findElement(By.id("pulse-slider"));
	
//	act.moveToElement(slider).moveByOffset(100, 0).click().build().perform();
	act.moveToElement(slider, 100, 0).click().build().perform();

	 Thread.sleep(4000);
	 driver.quit();
}
}
