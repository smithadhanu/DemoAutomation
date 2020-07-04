package Generics;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory implements Auto_Constants{

	private static Map<String,WebDriver> drivers =new HashMap<String,WebDriver>();
	
	public WebDriver getBrowser(String browserName)
	{
		WebDriver driver=null;
		switch(browserName)
		{
		case  "firefox":
		driver=drivers.get("firefox");
		if(driver==null)
		
			System.setProperty(gecko_key, gecko_value);
			driver=new FirefoxDriver();
			drivers.put("firefox", driver);
			break;
		
		case "chrome":
			driver=drivers.get("chrome");
			if(driver==null)
				System.setProperty(chrome_key, chrome_value);
			driver =new ChromeDriver();
			drivers.put("chrome", driver);
			break;
			
			default :
				System.out.println("not a vlid browser");
				break;
		}
		return driver;
		
		
	}
}
