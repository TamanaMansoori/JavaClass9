package Class18ThisKeyWord;

public class ConstructorChain {

    ConstructorChain(){
        System.out.println("I am none argument constructor");
    }

    /*ConstructorChain(){  we can't have multiple  none argument constructor with same name so here we get error but only when we have different parameter

    }*/

    ConstructorChain(String str){ //this is a parametrized constructor
        this(); //calling current class constructor which is in line 5. it always must be in first line
        System.out.println(str);
    }

    ConstructorChain(String str, int number){//this is also a parametrized constructor with different parameters
       // this();//non arugument is called which is line 5
        this(str);//this is the construcor that accepts the String parameter in line 13
        //here we hard codded the hello and if we wan to change we can't, so we can use str as parameter in line 18, now we can write any value tho (this("")
        System.out.println("this is constructor with the (int) parameter"+number);

    }

    public static void main(String[] args) {

        //ConstructorChain obj=new ConstructorChain(10); since we want to change the value of int and str then we can use it as below line :
        ConstructorChain obj=new ConstructorChain("hello",20);
        System.out.println("---End of the code---");
    }
}
