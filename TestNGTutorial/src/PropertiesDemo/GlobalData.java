package PropertiesDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\TestNGTutorial\\src\\PropertiesDemo\\Data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("URL"));
		prop.setProperty("URL", "firefox.com");
		System.out.println(prop.getProperty("URL"));
		//FileInputStream fis=new FileInputStream --- to read the data only
		FileOutputStream fos=new FileOutputStream("C:\\Users\\lenovo\\eclipse-workspace\\TestNGTutorial\\src\\PropertiesDemo\\Data.properties");
		//FileOutputStream -- to write back into the propertyfile
		prop.store(fos, null);//to store back into the property file
		

	}

}
