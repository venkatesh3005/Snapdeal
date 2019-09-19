package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnapDeal extends BaseClass {
	public static void main(String[] args) throws Throwable {
		launch();
		ttt("https://www.snapdeal.com/			");
		WebElement se = driver.findElement(By.id("inputValEnter"));
		search(se,"wallet");
		WebElement bu = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		click(bu);
		 WebElement wa = driver.findElement(By.xpath("//p[contains(text(),'Micron')]"));
		 click(wa);
		 windowHandle();
		 Thread.sleep(6000);
		 WebElement buy = driver.findElement(By.xpath("(//div[@supc='SDL914555756'])[4]"));
		 click(buy);
		 WebElement us = driver.findElement(By.id("username"));
		 search(us,"8526929857");
		 WebElement lo = driver.findElement(By.id("login-continue"));
		 click(lo);
		 Thread.sleep(5000);
		 WebElement pass = driver.findElement(By.xpath("//input[@id='w_password']"));
		 search(pass,"Darling@1");
		 WebElement log = driver.findElement(By.xpath("//button[@id='login-done']"));
		 click(log);
		 Thread.sleep(3000);
		 WebElement qu = driver.findElement(By.xpath("//div[@class='styledSelect sd-icon-expand-arrow customized']"));
		 click(qu);
		 robo(2);
	}

}



