package class9;

public class ArrayDemo {
    public static void main(String[] args) {
        //store the name of students

        String [] names={"Slava", "Safi","Jason","Nabi","Anees","Joseph"}; //this is the syntax for array
        System.out.println(names[2]);//this is the syntax to get the answer: sout=> varial name=>[]=> and write the number
        //NOTE: when we count the values, it always starts from zero(0).
        System.out.println(names[4]);
        System.out.println(names[5]);

        //System.out.println(names[7]);//since it is outside of the range or bound then we get error in the consul, and the numbers we put inside
        //the [] is called index.
     //   System.out.println(names[-5]);//we get error bc there is no - in the array the minimum index number is zero(0).

        System.out.println("================below we use loop to print all the name from the array===================");

        for (int i = 0; i <=6; i++) {
            System.out.println(names[i]);

        }





    }
}
