package class33;

import java.io.FileInputStream;

public class ThrowAndThrows {
    public static void main(String[] args) {


       // String path = null;
       // FileInputStream fileInputStream=new FileInputStream(path);

        String name="Abeera";
        if(name.length()<8){
            throw new RuntimeException("This name is not allowed");//here we create our own exception which say "This name is not allowed" in the console

            //here instead of RuntimeExcetion we can use our own excetion which we created a LazyExcetion class
        }
    }
}
