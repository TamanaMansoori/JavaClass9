package class8NestedLoop;

public class RecapDemo1 {

    public static void main(String[] args) {

        //10 8 6 4 2 using while loop
        int number=10;
        while(number>=2){
            System.out.println(number);
            number-=2; //subtract 2 from the number same as number=number-2
        }

        System.out.println("===================================Do While Loop============================================");
        int number2=10;

        do{
            System.out.println(number2);
            number2=number2-2;//same as number2-=2
        }while (number2>=2);

        System.out.println("==================================for loop=======================================");

        for(int i=10; i>=2; i-=2){
            System.out.println(i);
        }
    }


}
