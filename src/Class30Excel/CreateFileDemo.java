package Class30Excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateFileDemo {

        public static void main(String[] args) throws IOException {
            //Path where we want to create the file
            String path="";
            //we need to go to that path to create this file
            //programmatically this is how we do that

            //when we write the file we use fileOutputStream
            FileOutputStream fileOutputStream=new FileOutputStream(path);

            //create the object of properties class to store properties inside the file
            Properties properties=new Properties();

            //store key value pair inside the object
            properties.setProperty("Funny","true");

            //store this data in the form of a file on our hard drive
            properties.store(fileOutputStream,"A new property has been added");

            // close that file
            fileOutputStream.close();

//here we are just creating the file not printing,so nothing we show up on console

        }
    }

