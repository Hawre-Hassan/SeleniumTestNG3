package code.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {
    private static Properties properties=new Properties();
    //encapsulation method, we hide data
    static {String pathForPropertiesFile="configuration.properties";
        try{
            FileInputStream fileInputStream1=new FileInputStream(pathForPropertiesFile);
            properties.load(fileInputStream1);

        } catch (IOException e){e.printStackTrace();
            System.out.println("Properties file not found!!!");}
    }

 public static String getProperties(String keyword){
        return properties.getProperty(keyword);
 }
}