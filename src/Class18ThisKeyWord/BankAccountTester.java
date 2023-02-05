package Class18ThisKeyWord;

public class BankAccountTester {

    public static void main(String[] args) {

       BankAccount ba=new BankAccount();
       ba.accountNumber=23345566667l;
       ba.money=1000;
       ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        //object of checking account

        Checking check=new Checking();
        check.accountNumber=23344;//it is accessable from parent class
        check.interest=0;//it is feature from checking class (child)

        check.deposit();//come form parent class
        check.transfer();//come form child class

        //object of saving class

        Saving save = new Saving();
        save.accountNumber=23345566667l;//parent class
        save.money=7657;//parent class
        save.profit=100;//from own class(saving)
       // save.interest=0;//here we get error bc we can't inherit from child class it has to be taken from parent only
        save.deposit();//from parent class
        save.takeProfit();//from saving
       // save.transfer(); not able to inherent from child class


        SuperSaving superSave=new SuperSaving();
        superSave.deposit();
        superSave.accountNumber=456789l;
        superSave.superSaving();



    }
}
