package class4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money=15000;
        if(money>1000){
            System.out.println("Let's buy an Iphone");
        }
        if(money>2000){
            System.out.println("Let's also buy a MacBook");
        }

        boolean mothersDay=true;
        if(mothersDay){
            System.out.println("Happy morther's day");
        }

        String name="Sardar";
        if(name.equals(name)){
            System.out.println("I love football");
        }

        String name2="Mohammad";
        if(name2.equals(name2)){
            System.out.println("I love him");
        }
        /*
        NOTE: if we put (==) instead of (.equals) it sometimes works and sometimes dosen't work fine, so this way is not recommended.
         */


    }
}
