package Class14Method;

public class ArrayAddMachine {

    public static void main(String[] args) {

        int [] arr2={10,10,10,20,30};
        addArrayElementsMachine(arr2);

        int [] arr3={20,20,40,50,30};
        addArrayElementsMachine(arr3);

        int [] arr4={20,20,40,50,30};
        addArrayElementsMachine(arr4);

    }

    static void addArrayElementsMachine(int[]arr){//till what is the input

        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        System.out.println(sum);
    }
}
