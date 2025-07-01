package Main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ClassTwo {
	public static void main(String args[]) throws IOException {
		Properties propertiesobj = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//Load the Properties file.
		propertiesobj.load(file);
		
		//Reading the data from the File.
		String url = propertiesobj.getProperty("appurl");
		String email = propertiesobj.getProperty("email");
		String password = propertiesobj.getProperty("password");
		String orderId = propertiesobj.getProperty("orderId");
		String customerId = propertiesobj.getProperty("customerId");
		
		System.out.println(url +" " + " "+ email+" "+password+" "+orderId+" "+ customerId);
		
		//Reading all the keys from the Property files
		Set<String> keys = propertiesobj.stringPropertyNames();
		System.out.println("Keys are - "+ keys);
		
		//Reading all the values from the Property Files
		Collection<Object> values = propertiesobj.values();
		System.out.println("Values are - " + values);
		
		
		file.close();
	}
}
