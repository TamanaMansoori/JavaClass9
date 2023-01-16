package class6;

public class WhileLoop5 {
    public static void main(String[] args) {

        /*boolean condition=true;// if we put false then no execution will happen
        while(true){
            System.out.println("Hello world"); //it will execute only once bcu the next condition is false in line 9
            condition=false;
        }*/

        boolean condition=true;
        int number=0;
        while(condition){
            System.out.println("Hello world");
            if(number>3){
                condition=false;
            }
            number++;
        }
    }
}
