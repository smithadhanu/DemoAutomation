package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generics.Base_Page;


public class Login_Page extends Base_Page{

	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement unamebox;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement pnamebox;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement loginbox;
	
	public Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	public void getUsername(String uname)
	{
		unamebox.sendKeys(uname);
	}
	
	public void getPassword(String pname)
	{
		pnamebox.sendKeys(pname);
	}
	public void clickLogin()
	{
		loginbox.click();
	}
}
