package Generics;

import java.io.FileInputStream;
import java.util.Properties;

public class FileManager {
	Properties pro;
	public FileManager()
	{
		try {
			FileInputStream fis=new FileInputStream("./configuration.properties");
			 pro=new Properties();
			pro.load(fis);
						
		} catch (Exception e) {
			System.out.println("invalid login");
		}
		
			
	}
	
	public String getAppUrl()
	{
		String url = pro.getProperty("qatest1");
		if(url==null)
		{
			throw new RuntimeException("Invalid url");
		}
				
		return url;
	}
	public String getUatUrl()
	{
		String url = pro.getProperty("qatest2");
		if(url==null)
		{
			throw new RuntimeException("Invalid url");
		}
				
		return url;
	}
	public long getImplicitlywait()
	{
		String implicitwait = pro.getProperty("iw");
		if(implicitwait==null)
		{
			throw new RuntimeException("invalid time");
		}
		return  Long.parseLong(implicitwait);
	}
	public String getProdURL()
	{
		String produrl = pro.getProperty("qatest4");
		if(produrl==null)
		{
			throw new RuntimeException("invalid url");
		}
		return produrl;
		
	}

}
