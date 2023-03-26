package Class19Inheritance;

public class BaseClass {
    //instance variable
    String name="John";

    //method which is nonargumental bcoz we didn't pass any value to ()
    void hello(){
        System.out.println("Hello method from BaseClass ");
    }
}

//here we create new class which is the subclass of BaseClass

class Child extends BaseClass {
    String name = "Jane";//this same variable as line 5 but the value is different
    void callMe() {
        System.out.println(name);//(Jane)here we are refereig to name which is in child class
        System.out.println(super.name);//(John)by using (Supper) we get access to the name which is in the BaseClass
    }

    //the same method
    void hello(){
        System.out.println("Hello method from child class ");//calling the method from child class
    }

    //create method to call the parent method
    void callingParentMethod(){
        hello();//refer/calling the method from child class
        super.hello();//refer/calling the method from parent class which is instance method
    }

    ///here we test the code
    public static void main(String[] args) {
        Child child = new Child();
        child.callMe();

        child.callingParentMethod();
    }
}