package class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args)throws FileNotFoundException { //throws which implemented here is the second alternative for such an issue
        //but the preferred way is to use try catch .


       /* try {*/
            FileInputStream fileInputStream=new FileInputStream("name");//} this is the check exception
       /* catch (FileNotFoundException e){

        }*/

    }
}
