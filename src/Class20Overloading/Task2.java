package Class20Overloading;

public class Task2 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */


    //NOTE:we can overload the static method also instance method and constructor
    static void method(String str1){//this is a static method
        System.out.println("Method with one String ");
    }

    static void method(String str1, String str2){
        System.out.println("Method with 2 string");
    }

    static void method(String str1, String str2, String str3){
        System.out.println("Method with 3 string");
    }

    public static void main(String[] args) {
        method("java");
        method("Python","java");
    }
}
