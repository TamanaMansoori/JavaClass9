package class9Array;

public class Task1 {
    public static void main(String[] args) {
        //create an empty array then store 45 44 33 20 and 10 in it then use loop
        // to add all the elemens which are present in even indexes.

        int[] numbers = new int[5];
        numbers[0] = 45;// even index
        numbers[1] = 44;
        numbers[2] = 33;// even index
        numbers[3] = 20;
        numbers[4] = 10;// even index

        int addNum = 0;

        for (int i = 0; i < numbers.length; i++) {
          //  System.out.println(numbers[i]);
          //  addNum += numbers[i]; this will add all the add elements
            if (i % 2 == 0) {//here we check the index that is even
                addNum += numbers[i];

            }
        }
        System.out.println(addNum);

    }
    }
