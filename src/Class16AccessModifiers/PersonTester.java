package Class16AccessModifiers;

public class PersonTester {
    public static void main(String[] args) {

        //here we create the object of class person
        Person person=new Person();
      //  System.out.println(person.bankBalance);//since the bankBalance has private access in Person class, so we get error
        System.out.println(person.Address);
        System.out.println(person.name);

       // person.printPhoneNumber(); since it is private, we can't access it in this class
        person.printTikTokAccount();//we have access to it bcoz it is puclic
        person.printSNN();//we can have access to it bcoz it is de
    }
}
