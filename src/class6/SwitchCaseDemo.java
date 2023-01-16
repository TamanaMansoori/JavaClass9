package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="Afghanistan";
        switch (country.toLowerCase()){   //this changes the courty name to lower case
            case "usa":
                System.out.println("Burgers");
                break;
            case"Italy":
                System.out.println("Pasta");
                break;
            case"afghanistan":
                System.out.println("Qabili");
                break;
            default:
                System.out.println("wong country");
        }
    }
}
