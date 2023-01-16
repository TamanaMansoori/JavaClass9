package class6;

public class WhileLoop7 {
    public static void main(String[] args) {
        //print below sequence with the help of loop
        //1 2 3 4 6 7 8 9 11 12 13 14 16

        //it is madulus number

        int num=1;
        while(num<=16){
            if(num==5 || num==10 || num==15){//if num is 5, 10 or 15 don't print them

            }else {
                System.out.println(num);
            }
            num++;
        }

        System.out.println("----------------------SECOND YAW-----------------------------------------");

        int number2=1;
        while (number2<=16){
            if(number2%5!=0){
                System.out.println(number2);
            }
            number2++;
        }



    }
}
