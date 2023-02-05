package Class18ThisKeyWord;

public class Cars {

    String name;
    String model;
    int year;

    void BMW() {
        System.out.println("This is the brand new BMW car");
    }
}

    class Benz extends Cars {
        int price;

        void attributeOfBenz() {
            System.out.println("The most high speed car");
        }
    }
        class toyota extends Benz {
        String color;
        double mile;

        void carColor() {
            System.out.println("All cars have black color ");
            }
        }

        class Tesla extends Benz{

        void carModel (){
            System.out.println("This car has the latest model");
        }
        }




