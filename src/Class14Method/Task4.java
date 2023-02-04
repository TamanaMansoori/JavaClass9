package Class14Method;

public class Task4 {

    public static void main(String[] args) {

        /*
        4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */

       // StringBuilder str=new StringBuilder("This is sentence i want to reverse");//string builder
       // System.out.println(str.reverse());// this nethod is wrong

        //because we want to reverse the wording not the whole sentence

      //  String str1=str.toString();//converting a string bulider to string so that we can call methods from string

       String str=("This is sentence i want to reverse");
        String [] arr=str.split(" ");

   for(String word:arr){//this is enhance for loop

        for (int i = word.length()-1; i >=0 ; i--) {//this line reverse the word
            System.out.print(word.charAt(i));//prints the reverse word

        }

       System.out.print(" ");//it put the space or prints space



       // below is the shorter way that we change string to stringBuilder

       //String str=("This is sentence i want to reverse");
       //String [] arr=str.split(" ");
      // for(String word:arr){
       // System.out.println(new StringBuilder(word)reverse()+" "); creating the StringBuilder
      // }

        }

    }
}
