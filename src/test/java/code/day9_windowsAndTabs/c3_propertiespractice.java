package code.day9_windowsAndTabs;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class c3_propertiespractice {

    @Test
    public void TC1_System_properties(){
        System.out.println(System.getProperty("os.name"));
    }
    @Test
    public
    void configurationProperties() throws FileNotFoundException {
        Properties properties=new Properties();
//this is a properties for a file
        String pathForPropertiesFile="configuration.properties";

        FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);
            //file needs to be load in framework
            try{FileInputStream fileInputStream1=new FileInputStream(pathForPropertiesFile);
                properties.load(fileInputStream1);

            } catch (IOException e){e.printStackTrace();}
        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_url_username"));

    }
}
