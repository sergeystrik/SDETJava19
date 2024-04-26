package review8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigurationFile {
    public static void main(String[] args)  {

        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";

        try(FileInputStream fileInputStream=new FileInputStream(path)){

            Properties properties=new Properties();
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("url"));

        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
           }

       }


