package class9Array;

public class Task2 {
    public static void main(String[] args) {
        //create an array and store 10 20 30 4 5 6 7 80
        //add all the elements which are multiple of 2 .

        int [] num={10, 20, 30, 4, 5, 6, 7, 80 };

        int addAll=0;

        for (int i = 0; i <num.length ; i++) {
            if (num[i] % 2 == 0) {//here we check the actual value
                addAll += num[i];
            }
        }
        System.out.println(addAll);

        }
    }

