package com.log4j;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImortTaskDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		 minimizeFlyOutWindow();
		 imortTasks();


		

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web_Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplecation()
	{
		try
		{
			oBrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void imortTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'dropzoneClickableArea\']")).click();
		     Thread.sleep(2000);
		     String filename="\"C:\\Users\\91844\\Downloads\\Sample (4).csv\"";
		     copyfile(filename);
		     Thread.sleep(2000);
		     Robot robot=new Robot();
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_V);
		     Thread.sleep(2000);
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     robot.keyRelease(KeyEvent.VK_V);
		     Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(4000);


}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void copyfile(String filename) {
		StringSelection selection=new StringSelection(filename);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		
		
		
		//D:\ExampleAutomation\SampleD:\ExampleAutomation\Sample
		
	
	}
	 	
		
	}




