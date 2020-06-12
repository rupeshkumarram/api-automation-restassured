
package genericLib;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class GlobalVariable {

	public static String BaseURI = null;
	public static String API_KEY = null;
	public static String InputXML = null;


	//Initialize key variable from ini file
	public static String readIniValue(String key)
	{	
		String temp = "";
		Boolean keyExist = false;
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/main/resources/config/config.ini"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Enumeration<?> enumeration = prop.propertyNames();		
		while (enumeration.hasMoreElements())
		{

			String tempkey = (String) enumeration.nextElement();

			if(tempkey.equals(key))
			{	        	
				temp = prop.getProperty(key);
				keyExist = true;		        	
			}	        	
		}
		if(!keyExist)
			System.out.println(" Key is not specified in the Ini file");
		return temp;

	}

	public static String getBaseURI() {
		BaseURI = readIniValue("BaseURI");
		return BaseURI;
	}
	public static String getAPIKey() {
		API_KEY = readIniValue("API_KEY");
		return API_KEY;
	}
	public static String getInputXML() {
		InputXML = readIniValue("XMLPath");
		return InputXML;
	}

}
