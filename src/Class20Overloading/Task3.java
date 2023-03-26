package Class20Overloading;

public class Task3 {

     /*
    Create 1 class with a PRIVATE method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */


    //NOTE:we can overload the static method also instance method and constructor
    private void method(String str1){//this is a static method
        System.out.println("Method with one String ");
    }

    private void method(String str1, String str2){
        System.out.println("Method with 2 string");
    }

    private void method(String str1, String str2, String str3){
        System.out.println("Method with 3 string");
    }

    public static void main(String[] args) {

        //when we have private method then we call the object
        Task3 task3=new Task3();

        task3.method("java");
        task3.method("Python","java");
    }
}

