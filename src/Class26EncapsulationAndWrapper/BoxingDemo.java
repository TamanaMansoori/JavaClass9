package Class26EncapsulationAndWrapper;

public class BoxingDemo {
    public static void main(String[] args) {

        //
        int number=15;//it is primitive dataType
        printData(number);

        Integer f=10;//autoBoxing
        int number2=f;//

    }

    //method
    public static void printData(Integer numbers){//wrapper classes
        System.out.println(numbers);
    }
}
