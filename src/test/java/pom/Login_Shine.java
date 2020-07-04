package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generics.Base_Page;

public class Login_Shine extends Base_Page{

	public Login_Shine(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@class='cls_register_signin_homepage cls_login_header cls_call_dialogbox']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@id='id_email_login']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='id_password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login_popup']")
	private WebElement login;
	
	
	public void signinLink()
	{
		signin.click();
	}
	
	public void loginApp(String usename,String passname)
	{
		username.sendKeys(usename);
		password.sendKeys(passname);
		login.click();
	}
	
}
