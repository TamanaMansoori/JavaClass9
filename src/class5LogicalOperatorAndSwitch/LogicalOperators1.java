package class5LogicalOperatorAndSwitch;

public class LogicalOperators1 {
    public static void main(String[] args) {


        /*
        as long as there is only one true we get true as result
        as long as there is all false we get false as result

         */

        System.out.println(true||true); //true
        System.out.println(true||false);//true
        System.out.println(false||false);//false

        System.out.println(false||true||false||false);//the answer is true


        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if(boughtCho||boughtFlowers){
            System.out.println("I am happy");
        }else{
            System.out.println("I am sad");
        }

        boolean wifi=true;
        boolean fiveG=true;

        if(wifi||fiveG){
            System.out.println("You are good for browsing the internet");
        }else{
            System.out.println("Either connect to wifi or to 5G");
        }

    }
}
