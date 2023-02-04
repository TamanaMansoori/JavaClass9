package Class16AccessModifiers;

public class Person {

    private double bankBalance=1250000;//here we have private accest level
    String Address="Street 123";//here we don't use any key word so the defult access is applied
    public String name="Jon Snow";

    //below we create method

   private void printPhoneNumber(){//we use private bcoz it is important info
        System.out.println("pass123");
    }

    void printSNN(){// we can use defult access level which is automatically and has no keyword
        System.out.println("123456789");
    }

    public void printTikTokAccount(){//we use public bcoz it is accessable for everyone
        System.out.println();
    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);

        person.printPhoneNumber();
        person.printSNN();
        person.printTikTokAccount();



    }

}
