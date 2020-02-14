package com.robot.keyboardActivity;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadFileUsingRobotClass {
	
	@Test
	public void downloadFile() throws Exception {
		

		WebDriver driver = new FirefoxDriver();

		driver.get("https://smallpdf.com/result#r=bd9062137ff96c0cb179cda6214c34e1&t=word");

		driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div/div[3]/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/a/div[1]/div[1]")).click();

		Thread.sleep(3000);
		
		Robot robot= new Robot();//Robot class available in java.awt package
		
		robot.keyPress(KeyEvent.VK_TAB);//To press the TAB key on keyboard
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);//To press the Enter key on keyboard
		
		
	}

}
