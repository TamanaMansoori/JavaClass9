package Class12;

public class StringlenghtDemo {
    public static void main(String[] args) {
        //creating an object of the string class
        String strObj=new String("Java");//longer way of creating the object of String class
        String strObj2="Java";//a shorter way of creating object of a string class

        System.out.println(strObj2.length());//it shows the number of letter/characters in (strObj) variable and the output of this lenght is integer
        String str="Banana ";
        int len=str.length();//here we assign the lenght to the int type
        System.out.println(len);//after assigning here we get the output

        String name="Hamid";
        if(name.length()>10){
            System.out.println("Name can't be less than 10 letters");
        }

    }
}
