package Class20Overloading;

public class Programming {
    /*
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    then the message "I love programming languages" should be printed. If some String is passed to it,
    then in place of "programming languages" the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed
     */

    String language;

    public Programming(){//this is a constructor without any value
        System.out.println("I love programming language");
    }

    public Programming(String language){
        System.out.println("I love "+language);
    }

    public static void main(String[] args) {
        new Programming();//line 13 will be executed bco it is without value
        Programming programming=new Programming("Java");//we use thid when we want to call specific method and it can also be used withoud (Programming programmin=)
        new Programming("Java");//same as line 22

    }
}
