package class9;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //write 10 20 30 40 50

        int []number={10, 20, 30, 40, 50};
        int total=0;

        for (int i = 0; i < number.length; i++) {// index starts from zero so we put (int i=0)
            System.out.println(number[i]);
            total+=number[i];//this adds the numbers and for doing so we first need to intialize the varibale total or sum
            System.out.println(total);

        }



    }
}
