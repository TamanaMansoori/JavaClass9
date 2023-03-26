package Class20Overloading;

import java.awt.*;

public class Task1 {
    /*
Create 1 class in which create a methods that will calculate the area of
Rectangle
Square
     */


    void Rectangle(int num, int num2) {
        System.out.println(num * num2);
    }

    void Square(int num3, int num4) {
        System.out.println(num3*num4);

    }


    public static void main(String[] args) {

        Task1 task1=new Task1();
        task1.Rectangle(2,4);
        task1.Square(6,4);

       


    }
}