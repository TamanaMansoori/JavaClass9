package class5;

public class LogicalOperator2 {
    public static void main(String[] args) {
        /*
        (&&) this is called and
        task:
        only true if the all conditions are true
        false and false =false
        false and true=false
        true and false=fasle
        true and true=true

        if the score in all the sujbectes are greater than 90 print brilliant student otherwise print you need to work hard
         */

        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;

        if(mathScore>90 &&historyScore>90 &&scienceScore>90){
            System.out.println("You are a brilliant student");
        }else {
            System.out.println("You need to work hard");
        }
    }
}
