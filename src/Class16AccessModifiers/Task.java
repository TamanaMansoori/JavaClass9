package Class16AccessModifiers;

public class Task {
    /*
    Create a method that will print whether given String is palindrome or not.
    when we only print something we use the void
    return type= void
    name= isPalindrome
    parameters= String inputStr
     */

    void isPalindrome(String str){
        String stt="dad";
        StringBuilder st=new StringBuilder(stt);
        st.reverse(); //this will revers stt
        String reversed=st.toString();
        if(stt.equals(reversed)){
            System.out.println(stt+" is palindrome");
        }else{
            System.out.println(stt+" is not palindrome");
        }

    }

    public static void main(String[] args) {
       //here we create the object of class
        Task task=new Task();
        task.isPalindrome("Kaya");




    }
}
