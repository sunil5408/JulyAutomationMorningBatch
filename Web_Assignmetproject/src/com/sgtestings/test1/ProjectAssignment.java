package com.sgtestings.test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectAssignment {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser();
		deleteUser();
		createUser1();
		modifyUser();
		createCompany();
        closeApplecation();



	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web_Assignmetproject\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("https://enigmatic-meadow-39517.herokuapp.com/students/sign_in");
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
        oBrowser.findElement(By.xpath("//*[@id=\'student_email\']")).sendKeys("sunilkumarpatil5408@gmail.com");
        oBrowser.findElement(By.xpath("//*[@id=\'student_password\']")).sendKeys("shivbaba");
        oBrowser.findElement(By.xpath("//*[@id=\'new_student\']/div[4]/input")).click();
        Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'nav\']/a[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[2]/a[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'user_first_name\']")).sendKeys("sunil");
			oBrowser.findElement(By.xpath("//*[@id=\'user_last_name\']")).sendKeys("patil");
			oBrowser.findElement(By.xpath("//*[@id=\'user_email\']")).sendKeys("java@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'user_phone_number\']")).sendKeys("1234567899");
			oBrowser.findElement(By.xpath("//*[@id=\'user_address\']")).sendKeys("bidar");
			oBrowser.findElement(By.xpath("//*[@id=\'user_state\']")).sendKeys("Andra Pradesh");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'user_zipcode\']")).sendKeys("585326");
			oBrowser.findElement(By.xpath("//*[@id=\'new_user\']/div[8]/input")).click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'nav\']/a[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'paginate_table\']/tbody/tr/td[10]/a")).click();
			Alert obj=oBrowser.switchTo().alert();
			obj.accept();
	    }catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'nav\']/a[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[2]/a[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'user_first_name\']")).sendKeys("sunil");
			oBrowser.findElement(By.xpath("//*[@id=\'user_last_name\']")).sendKeys("patil");
			oBrowser.findElement(By.xpath("//*[@id=\'user_email\']")).sendKeys("java@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'user_phone_number\']")).sendKeys("1234567899");
			oBrowser.findElement(By.xpath("//*[@id=\'user_address\']")).sendKeys("bidar");
			oBrowser.findElement(By.xpath("//*[@id=\'user_state\']")).sendKeys("Andra Pradesh");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'user_zipcode\']")).sendKeys("585326");
			oBrowser.findElement(By.xpath("//*[@id=\'new_user\']/div[8]/input")).click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'nav\']/a[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'paginate_table\']/tbody/tr[1]/td[9]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'user_address\']")).clear();
			oBrowser.findElement(By.xpath("//*[@id=\'user_address\']")).sendKeys("aurad");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'edit_user_24129\']/div[8]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	static void createCompany()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'nav\']/a[3]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[2]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'company_name\']")).sendKeys("sg");
			oBrowser.findElement(By.xpath("//*[@id=\'company_email\']")).sendKeys("sg@gmail.com");
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\"company_phone_number\"]")).sendKeys("1234567899");
			oBrowser.findElement(By.xpath("//*[@id=\'company_address\']")).sendKeys("gulbarga");
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'new_company\']/div[5]/input")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	static void delete()
	{
		try
		{
		//	oBrowser.findElement(By.xpath(""))
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
}
