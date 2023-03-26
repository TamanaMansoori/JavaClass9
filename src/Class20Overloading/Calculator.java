package Class20Overloading;

public class Calculator {

    //method is below
    void add(int num1, int num2){//it is a parametrized method beacuse we are declaring the variable inside it
        System.out.println(num1+num2);
    }

    //below is same method and we want to overload it
    void add(int num1, int num2,int num3){//here we change the parameteres inside the method . we can either add a parameter or add different data type
        System.out.println(num1+num2+num3);
    }

    //below is same method and we want to overload it
    void add(int num1, double num4, int num2,int num3){//here we add one different data type the parameteres
        System.out.println(num1+num4+num2+num3);
    }

    void add(double num4,int num1 ,int num3, int num2){//here we change the sequence of parameteres
        System.out.println(num1+num2);
    }
}
