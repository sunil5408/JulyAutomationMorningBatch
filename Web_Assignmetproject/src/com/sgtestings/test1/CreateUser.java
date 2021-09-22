package com.sgtestings.test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser {
	public static WebDriver oBrowser=null;
	public static ActiPage1 oPage=null;

	public static void main(String[] args) {
		
	
	launchBrowser();
	navigate();
	login();
//	minimizeFlyOutWindow();
	//createuser();	
	//deletcreate();
	//logout();
	//closeApplication();
}
static void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web_Assignmetproject\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oPage=new ActiPage1(oBrowser);
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

static void login()
{
	try
	{
		oPage.getusername().sendKeys("admin");
		oPage.getPassword().sendKeys("manager");
		oPage.getloginbutton().click();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void minimizeFlyOutWindow()
{
	try
	{
		oPage.getminwindow().click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void createuser()
{
	try
	{
		oPage.getCreatuser().click();
				Thread.sleep(4000);
		oPage.getadduser().click();
		Thread.sleep(4000);
		oPage.getfirstname().sendKeys("sunil");
		oPage.getlastName().sendKeys("patil");
		oPage.getemail().sendKeys("dem0@gmail.com");
		oPage.getusername().sendKeys("ravi");
		oPage.getuserpassword().sendKeys("2222");
		oPage.getpasswordCopyField ().sendKeys("2222");
		oPage.getcreateusercoomit().click();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void deletcreate()
{
	try
	{
		oPage.gettablecontainer().click();
		Thread.sleep(4000);
		oPage.getdeleteBtn().click();
		Alert obj=oBrowser.switchTo().alert();
		String cont=obj.getText();
		System.out.println(cont);
		obj.accept();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void logout()
{
	try
	{
		oPage.getlogout().click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void closeApplication()
{
	try
	{
		oBrowser.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}








