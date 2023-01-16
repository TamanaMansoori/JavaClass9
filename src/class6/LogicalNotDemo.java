package class6;

public class LogicalNotDemo {
    public static void main(String[] args) {

        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);

        String password="Pass12345";
        if(!password.equals("Pass12345")){
            System.out.println("Wrong password");
        }

        boolean isRaining=true;

        if(!isRaining){
            System.out.println("lets go for a walk");
        }else {
            System.out.println("let take the umbrella");
        }


    }
}
