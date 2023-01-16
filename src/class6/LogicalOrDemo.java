package class6;

public class LogicalOrDemo {
    public static void main(String[] args) {

        String day="sunday";
        if(day.equals("Monday")|| day.equals("Friday")){
            System.out.println("No class today");

            /*
            if we want to ignore the uppercase and lower case we can use the  (.equalsIgnoreCase)
             */
        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("sunday")){
            System.out.println("Java Class enjoy");
        }else if(day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("tuesday")){
            System.out.println("Manual testing class");
        }else if(day.equalsIgnoreCase("thursday")){
            System.out.println("review class");
        }else{
            System.out.println("Wrong day entered");
        }

    }
}
