package Class19Inheritance;

public class Parent {


    String name;
    static String lastName;

    //create constructor here
   /* private Parent(){// here I will change it from Private to Public bcz I will get error
        System.out.println("I am a parent class constructor");
        line 10 and 15 are the same excet the access modifier that I have changes
    }*/

    public Parent(){// here I will change it from Private to Public bcz I will get error
        System.out.println("I am a parent class constructor");
    }

    public static void main(String[] args) {
        //object of parent class
        Parent p=new Parent();
    }

    public void hello(){//public is access modifier and void is method
        System.out.println("Public method, Hello from parent class");
    }

    protected static void bye(){
        System.out.println("Protected method, Bye from parent class");
    }

    private void money(){
        System.out.println("Private method, Bye from parent class");
    }
}
