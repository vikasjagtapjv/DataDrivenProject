package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	String src="C:\\Users\\vikas\\eclipse-workspace\\com.InsuranceDomain\\src\\main\\resources\\Property\\config.properties";
		public ReadConfig() {
		try {
			pro=new Properties();
		    FileInputStream fis = new FileInputStream(src);
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	public String getApplicationUrl()
	{
		String url=pro.getProperty("weburl");
		return url;
	}
	public String getUserName()
	{
		String userN=pro.getProperty("userName");
		return userN;
	}
	public String getPassword()
	{
		String pass=pro.getProperty("password");
		return pass;
	}

}
