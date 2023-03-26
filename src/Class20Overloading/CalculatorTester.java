package Class20Overloading;

public class CalculatorTester {
    public static void main(String[] args) {

        //create the object

        Calculator calculator=new Calculator();
        calculator.add(10,10);//line 6 will be executed it identifies it by parameters that we have inside the method
        calculator.add(2,4,6); //line 11 from calculator class will be executed
        calculator.add(7,2.83,7,9);
        //if java dosen't find the best match, it can do the casting only (narrowing) can be done by java automatically

    }
}
