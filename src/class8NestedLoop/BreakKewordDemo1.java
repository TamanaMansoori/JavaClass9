package class8NestedLoop;

public class BreakKewordDemo1 {
    public static void main(String[] args) {
        //we can use break for loop do while loop and while loop
        // we use the brek whe we use multipul
       boolean summer=true;
        int temp=75;

        while(summer){
            if(temp<=100){
                System.out.println("I love summber because Temperature is "+temp);
            }else{
                System.out.println("It is very hot "+temp);
                break;
            }
            temp+=5;

        }

        System.out.println("===========write same example without break keywrod");

        //boolean summer=true;
        int temp2=75;

        while(temp2<=105) {
            if (temp2 <= 100) {
                System.out.println("I love summber because Temperature is " + temp2);
            } else {
                System.out.println("It is very hot " + temp2);
            }
            temp2 += 5;
        }
    }
}
