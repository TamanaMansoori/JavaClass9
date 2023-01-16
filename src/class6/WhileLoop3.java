package class6;

public class WhileLoop3 {
    public static void main(String[] args) {

        int number=10;
        while(number>0){
            System.out.println(number);
            number--;
        }

        System.out.println("--------------------------------Scanner--------------------------------");

        int num=1;
        int sum=0;
        while(num<=10){
            sum=sum+num;
            num++;
        }
        System.out.println(sum);//we put the sout out of curely bracket bcz we need the result of sum if we want to print all the values
        //or all the numbers then we can write the sout inside the curly brackets.
    }
}
