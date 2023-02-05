package Class18ThisKeyWord;

public class BankAccount {//this is my parent(super)class or base
    //these are variable
    long accountNumber;
    double money;

    //create method
    void deposit(){
        System.out.println("Deposit method from bank account class ");
    }
}

//here we make another class (child class) which is out of our first class (Parent Class)
//by extends we create a relationship with parent and child class
class Checking extends BankAccount{//this is a child class or sub class or derived class(parent class)

    //we create object of bank accout
    double interest;


    void transfer(){
        System.out.println("Transfer method from checking class");
    }

}

//anothere class

class Saving extends BankAccount{//sub class of parent class (BankAccount)

    //some features or method
    double profit;

    void takeProfit(){
        System.out.println("Profit method from saving class ");
    }
}


class SuperSaving extends Saving{ //this is another sub class

    void superSaving(){
        System.out.println("Super saving method form SuperSaving class");
    }

    //HW: finish creating superSaving object and see which features are avaliable to that class

        }