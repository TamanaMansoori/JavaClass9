package homeWork;

public class HomeWork1Class6 {
    public static void main(String[] args) {

        // write a loop to print numbers from 1 to 100

        int num=1;
        while(num<=100){
            System.out.println(num);
            num++;
        }

        System.out.println("---------------------Task2-------------------------");
        // write a loop to print odd numbers from 1 to 15

        int num1=1;
        while(num1<=15){
            if(num1%2!=0){
                System.out.println(num1);
            }
            num1++;
        }

        System.out.println("--------------------------Task3----------------------------");

        // write a loop to print these number 5,10,15,20,25,30.... 50

        int num2=5;
        while(num2<=50){
            if (num2%5==0){
                System.out.println(num2);
            }
            num2++;
        }



    }
}
