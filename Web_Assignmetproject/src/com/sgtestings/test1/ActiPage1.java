package com.sgtestings.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage1 {

	public ActiPage1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);

	}
	private WebElement username;
	public WebElement getUserUame()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='login']")
	private WebElement login;
	public WebElement getloginbutton()
	{
		return login;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getminwindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//a[@href and @class='content users']")
	private WebElement contentusers;
	public WebElement getCreatuser()
	{
		return contentusers;
	}
	@FindBy(xpath="//div[@class='buttonText']")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement  getuserpassword()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement  getpasswordCopyField ()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//span[@class='buttonTitle']")
	private WebElement createusercommit;
	public WebElement getcreateusercoomit()
	{
		return createusercommit;
	}
	@FindBy(xpath="//div[@class='name']")
	private WebElement tablecontainer;
	public WebElement gettablecontainer()
	{
		return  tablecontainer;
	}

	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteBtn()
	{
		return userDataLightBox_deleteBtn;
	}

	private WebElement logoutLink;
	public WebElement getlogout()
	{
		return  logoutLink;
	}
}
