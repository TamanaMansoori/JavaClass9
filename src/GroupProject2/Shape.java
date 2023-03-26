package GroupProject2;

public interface Shape {

    void calculateArea();

    void calculatePerimiter();

}

class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Calculating the Area ");
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Calculating the Permiter ");

    }
}

class Square implements Shape{


    @Override
    public void calculateArea() {
        System.out.println("Here is the calculation for area");

    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Here is the calculation for perimeter ");
    }


    public static void main(String[] args) {

        Shape [] shape={new Square(), new Circle()};
        for (Shape x:shape){
            x.calculateArea();
            x.calculatePerimiter();
        }
    }
}
