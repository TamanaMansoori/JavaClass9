package Class24Interface;

public interface TrustAble {
    public static final int age=10;
    String color="Blue";
    //abstract method
    int trust();
    //method
    static void method1(){//static method

    }

}

class Bank implements TrustAble{
    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);
    }
}