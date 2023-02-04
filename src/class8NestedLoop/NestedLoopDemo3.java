package class8NestedLoop;

public class NestedLoopDemo3 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {//outer for loop is controlling how many lines we write , so there will be 3 line and for each line 5 stars
            for (int j = 0; j < 5; j++) {// inner loop shows how many stars we write

                if(j==1 || j==2){//we are skipping the 1 and 2 here so the result will be 3 lines of code with 3 stars
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();//it shows new line in between the code,
            // if we remove it there will be no line and all execution will be in the same line
        }
    }
}
