package Class19Inheritance;

public class userClass {
    /*
Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.
     */
//create instance variable
    String name;
    String mobileNumber;

//create parametrized constructor
    userClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

}

//create sub Class
class userInfo extends userClass {
    String address;

    //create paramtetrized constructor
    userInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    ///create method
    void userDetails() {
        System.out.println("User name is " + name + " mobile number is " + mobileNumber + " and address is " + address);
    }

//test the code
    public static void main(String[] args) {
        userInfo user = new userInfo("Tamana", "23434556666", "234 dallas Texas");
        user.userDetails();
    }
}

//all classes in Java have a Parent class
//the parent of all classes is Object class and has a default constructor