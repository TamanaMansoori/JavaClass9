package class4;

public class NestedIfDemo6 {
    public static void main(String[] args) {

        int money = 100;
        String day = "Sunday";
        boolean mood = true;

        if (money > 700) {
            if (mood) {
                System.out.println("I will go for shopping");
            }
        } else {
            System.out.println("Let's first save some money");//if code will be executed only if the condition in the line 6 is not true
        }
    }
}
