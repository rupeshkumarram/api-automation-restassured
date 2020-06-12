/*
package genericLib;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonPropReader {
	public String filepath;

	public JsonPropReader(String filepath){
		this.filepath=filepath;
	}

	public String jRead(String key) {
		JSONParser parser = new JSONParser();
		JSONObject jo=null;
		try {
			Object obj = parser.parse(new FileReader(filepath));
			jo = (JSONObject)obj;
		}catch(Exception e) {
			e.printStackTrace();
		}

		return (String) jo.get(key);
	}

	public String pRead(String key) {
		Properties locator= new Properties();

		try{
			// config
			FileInputStream fs=null;
			fs = new FileInputStream(filepath);
			locator.load(fs);
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return locator.getProperty(key);
	}


	public static JSONObject parseJson(String filePath) {
		JSONParser parser = new JSONParser();
		JSONObject jo=null;
		try {
			Object obj = parser.parse(new FileReader(filePath));
			jo = (JSONObject)obj;
		}catch(Exception e) {
			System.out.println("Exception while creating object");
		}

		return jo;
	}

	@SuppressWarnings("unchecked")
	public static String getEnvironment(String env) {
		String environ = null;
		String filePath = "./src/main/resources/config.json";

		// getting environments 
		Map<String, String> address = ((Map<String, String>)parseJson(filePath).get("environment")); 
		// iterating environment Map 
		Iterator<Map.Entry<String, String>> itr1 = address.entrySet().iterator();

		while (itr1.hasNext()) { 
			Map.Entry<String, String> pair = itr1.next();
			if(pair.getKey().equals(env)) {
				environ = pair.getValue();
				break;
			}

		}

		return environ;
	}

	@SuppressWarnings("unchecked")
	public static String[] getCredential(String user) {
		String credPair[]= new String[2];
		String filePath = "./src/main/resources/config.json";

		// getting credentials 
		Map<String, Object> credential = ((Map<String, Object>)parseJson(filePath).get("credential")); 
		// iterating environment Map 
		Iterator<Map.Entry<String, Object>> itr1 = credential.entrySet().iterator();

		while (itr1.hasNext()) { 
			Map.Entry<String, Object> pair = itr1.next();

			if(pair.getKey().equals(user)) {

				Map<String, String> cred = (Map<String, String>) pair.getValue();
				Iterator<Map.Entry<String, String>> itr2 = cred.entrySet().iterator();
				while (itr2.hasNext()) { 
					Map.Entry<String, String> pair1 = itr2.next();
					credPair[0]=pair1.getKey();
					credPair[1]=pair1.getValue();
				}
				break;
			} 
		} 

		return credPair;
	}

	public static String getColumnNum(String screen, String columnName) {
		String columnID = null;
		String filePath = "./src/main/resources/testData.json";
		// getting environments 
		@SuppressWarnings("unchecked")
		Map<String, String> address = ((Map<String, String>)parseJson(filePath).get(screen)); 
		// iterating environment Map 
		Iterator<Map.Entry<String, String>> itr1 = address.entrySet().iterator();
		while (itr1.hasNext()) { 
			Map.Entry<String, String> pair = itr1.next();
			if(pair.getKey().equals(columnName)) {
				columnID = pair.getValue();
				break;
			}
		}
		return columnID;
	}


	public static void main(String[] args) {
		String environ = getEnvironment("DEV");
		System.out.println("Print environment: "+environ);
		System.out.println("-------------------------------------------------------");
		String str[] = getCredential("user5");
		System.out.println("Username: "+str[0]);
		System.out.println("Password: "+str[1]);
		/*	JSONParser parser = new JSONParser();
		JSONObject jo=null;
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\ru20104049\\eclipse-philips\\hsdp-mcsui-regression\\src\\main\\resources\\Config\\delete.json"));
			jo = (JSONObject)obj;
		}catch(Exception e) {
			e.printStackTrace();
		}


		// getting environments 
        Map address = ((Map)jo.get("environment")); 
        // iterating environment Map 
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();

        while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue());

        } 


        System.out.println("-----------------------------------------------");

        // getting credentials 
        Map credential = ((Map)jo.get("credential")); 
        // iterating environment Map 
        Iterator<Map.Entry> itr2 = credential.entrySet().iterator();

        while (itr2.hasNext()) { 
            Map.Entry pair = itr2.next();

            Map cred = (Map) pair.getValue();
            Iterator<Map.Entry> itr3 = cred.entrySet().iterator();
            while (itr3.hasNext()) { 
                Map.Entry pair1 = itr3.next(); 
                System.out.println(pair1.getKey() + " : " + pair1.getValue());

            } 

        } 
		 
	}

}

*/