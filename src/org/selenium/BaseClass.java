package org.selenium;

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BaseClass {
		public static WebDriver driver;
		public static WebDriver launch(){
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\Ecli\\Browser\\driver\\chromedriver.exe");
			   driver=new ChromeDriver();
			    
				return driver;
		}
		public static void ttt(String url) {
			driver.get(url);
			
		}
		public static void search(WebElement w,String s){
			w.sendKeys(s);
			
		}
		public static void click(WebElement w) {
			w.click();
		}
		public static void windowHandle(){
			 String p = driver.getWindowHandle();
			 System.out.println(p);
			    Set<String> all = driver.getWindowHandles();
			    System.out.println(all);
			    for (String x : all) {
			    	if(!p.equals(x)) {
			    		driver.switchTo().window(x);
			    	}
				}
		}
			    public static void robo(int v) throws Throwable {
				    Robot r=new Robot();
				    for(int i=0;i<v;i++) {
				    r.keyPress(KeyEvent.VK_DOWN);
				    r.keyRelease(KeyEvent.VK_DOWN);	
				    
			    }
				    r.keyPress(KeyEvent.VK_ENTER);
				    r.keyRelease(KeyEvent.VK_ENTER);
		
			    
		}
	}

	



