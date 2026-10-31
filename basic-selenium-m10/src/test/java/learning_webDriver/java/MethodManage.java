package learning_webDriver.java;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodManage {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(3000);
	Window win = driver.manage().window();
	 	//driver.manage().window().maximize();
	 	//driver.manage().window().minimize();
	 	//driver.manage().window().fullscreen();
	 	win.maximize();
	 	win.minimize();
	 	win.fullscreen();
	 	
	 	//get size of window 
	 	Dimension dim1 = win.getSize();
	 	int h = dim1.getHeight();
	 	int w = dim1.getWidth();
	 	System.out.println(dim1);
	 	System.out.println(w);
	 	System.out.println(h);
	 	
	 	//get position of the window
	 	//int X= driver.manage().window().getPosition().getX
	 	Point pt1 = win.getPosition();
	 	int X = pt1.getX();
	 	int Y = pt1.getY();
	 	System.out.println(pt1);
	 	System.out.println(X);
	 	System.out.println(Y);
	 	
	 	//set size of the window 
	 	//driver.manage().window().setSize(new Dimension(w,h))
	 	win.setSize(new Dimension(450,234));
	 	System.out.println(win.getSize());
	 	
	 	//set position of the window 
	 	//driver.manage().window().setPosition(new Dimension(x,y))
	 	win.setPosition (new Point(33,99));
	 	System.out.println(win.getPosition());
	 	
	 	
	 	Thread.sleep(3000);
	 	driver.quit();
	 	
	}
}
