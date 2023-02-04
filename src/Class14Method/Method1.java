package Class14Method;

public class Method1 {

    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        for (int i = 0; i <=4; i++) {
            System.out.println(i);//print all elements

        }
            System.out.println("____________________________________");

            //add all elements
            int sum=0;
            for(int number:arr){
                sum+=number;
            }
            System.out.println(sum);

        System.out.println("----------------------------Second---------------------------");

          int [] arr2={10,10,10,20,30};

          int sum2=0;
          for(int number:arr2){
              sum2+=number;
          }
        System.out.println(sum2);

        System.out.println("_______________________________Third__________________________");

        int [] arr3={100,100,100,200,300};

        int sum3=0;
        for(int number:arr3){
            sum3+=number;
        }
        System.out.println(sum3);





    }
}
