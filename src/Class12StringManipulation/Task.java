package Class12StringManipulation;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        Store username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
         */


        String username = "abcd";
        String password = "123456789";
        String confirmedPassword = "123456789";
        boolean isEmpty1 = username.isEmpty();
        boolean isEmpty2 = password.isEmpty();

        if (username.equals(isEmpty1) && password.equals(isEmpty2)) {
            System.out.println("Username and Password cannot be empty");
        } else if (password.length() <= 8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmedPassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }

        System.out.println("*************Using Scanner with same Task*********************************");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your username");
        String userName=scanner.next();
        System.out.println("Please enter your password");
        String password1=scanner.next();
        System.out.println("Please enter your password again");
        String confirmPassword=scanner.next();
        if(userName.isEmpty() || password1.isEmpty()){
            System.out.println("User name and password can't be empty");
        } else if (password1.length()<8) {
            System.out.println("Password is too short");
        } else if (password1.contains(userName)) {
            System.out.println("Password cannot contains username");

        }else if(!password1.equals(confirmedPassword)){
            System.out.println("Password dosen't match");
        }else{
            System.out.println("Your username and password has been created");
        }


    }
}
