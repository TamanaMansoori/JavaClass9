package class6WhileLoop;

public class WhileLoop2 {
    public static void main(String[] args) {

        int number=1;
        while(number<5){
            System.out.println(number);
            number++;
        }

        int number2=0;
        while(number2<10){
            System.out.println(number2);
            number2+=2;  //here we increment the number by 2

        }
        System.out.println("-------------------------TASKS------------------------------------------");

        //write a loop to print number from 1 to 100
        // write a loop to print odd numbers from 1 to 15
        // write a loop to print these number 5,10,15,20,25,30.... 50

        int num=1;
        while(num<=100){
            System.out.println(num);
            num++;
        }
        System.out.println("--------------------------------------------------------------------");

       int oddNum=1;
        while (oddNum<=15){
            System.out.println(oddNum);
            oddNum+=2; //by this we make it odd number
        }

        System.out.println("---------------------------------------------------------------------");

        int num3=5;
        while(num3<=50){
            System.out.println(num3);
            num3+=5;
        }


    }
}
