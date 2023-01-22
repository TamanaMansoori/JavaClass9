package class8;

public class ContinueKeyWordDemo1 {
    public static void main(String[] args) {

        //here we want to skip some numbers or specific number like 3 6 9

        for (int i = 0; i < 10; i++) {
           if(i%3==0){ // for 3 6 9 the condition will be true
                continue;//skip all the other lines after continue
          }else{
              System.out.println(i);//if condition is false the this line and line 14 will be executed and when condition is false , is skips the rest
            }
           System.out.println("Hello Java");

        }
    }
}
