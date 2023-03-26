package Class18ThisKeyWord;

public class Furniture {

    //instance varuable is created below

    String type;
    double price;
    String color;

    //constructor is created below and it is parameterized one , here we initialize instance variables  with specific value

    Furniture(String type, double price, String color ) {

        this .type=type;
        this.price=price;
        this.color=color;

    }


    //below is a method with same name . why becasue of return type

    //void Furniture(){
//}

    //method is created below
    void print(){
        System.out.println(type+" price is "+price+" and color is "+ color);
    }
}
