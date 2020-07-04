package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import Generics.BrowserFactory;
import Generics.FileManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;
import pom.Login_Shine;

public class StepsShine {
  
	WebDriver driver;
	BrowserFactory bff= new BrowserFactory();
	Login_Shine lp;
	@Before
	public void openAppln()
	{
		driver=bff.getBrowser("chrome");
		FileManager fm=new FileManager();
		driver.get(fm.getUatUrl());
		lp=new Login_Shine(driver);
		driver.manage().timeouts().implicitlyWait(fm.getImplicitlywait(), TimeUnit.SECONDS);
	}
	@After
	public void closeAppln()
	{
		driver.quit();
	}
	
	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
	    
		System.out.println("user is already on login page");
	}
	@When("title of page shine")
    public void title_of_page_shine()
    {
    	System.out.println("title of page is shine");
	}
	@Then("click on login link")
	public void click_on_login_link() {
	    lp.signinLink();
	}

	@Then("user enters {string} and  {string} login")
	public void user_enters_and_login(String usename, String passname) {
	    lp.loginApp(usename, passname);
	}

	@Then("user is on home page title")
	public void user_is_on_home_page_title() {
	  
		String atitle = driver.getTitle();
		Assert.assertEquals("Jobs 2020 - Search Jobs in India, Latest Job Vacancies, Recruitment - Shine.com", atitle);
       //System.out.println("home page title is displayed");
	}

	
}
