package Class19Inheritance;

public class Shape {

    int radius;

    Shape(int radius){
        this.radius=radius;
    }
}
 class Circal extends Shape{
    double value;
    Circal(int radius,double value){
        super(radius);
        this.value=value;
    }

     void area () {
         System.out.println("The area is "+(radius*value*value));
     }

     public static void main(String[] args) {
         Circal printInfo=new Circal(2,1.2);
         printInfo.area();
     }
 }