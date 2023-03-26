package Class19Inheritance;

public class Child1 extends Parent {

    public static void main(String[] args) {

        //object of class

        Child1 c1=new Child1();
        c1.hello();
        c1.bye();
        Parent.bye();
        Child1.bye();
        //NOTE: line 11, 12 and 13 all are correct but the prefered way is line 12 bcoz we call the static modifier by class name

        //  c1.money();//we get error bcoz it is private

        c1.name+="Tamana"; //instance member is accessed this way by the object of class
        Child1.lastName="Mansoori";// static member is accessed by class name







    }


}
