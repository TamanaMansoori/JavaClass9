package Class21Overriding;

public class CreditCard {

    /*
//Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.

     */

    double balance;
    double interest;


    //below is constroctor

    CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }

    //other way to create constructor
    //right click on class and then select generate and then select  constructor

   public void CalculateInterest(){

       System.out.println("Interest "+(balance*interest)/100);
    }

}



class Visa extends CreditCard{

    public Visa(double balance, double interest){
        super(balance,interest);
    }

}


class AX extends CreditCard{
  AX (double balance, double interest){
      super(balance,interest);
  }

    @Override
    public void CalculateInterest () {
        System.out.println("Interest "+(balance*interest/100)+30);
    }


    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,10);
        creditCard.CalculateInterest();

        Visa visa=new Visa(100,10);
        visa.CalculateInterest();

        AX ax=new AX(100, 10);
        ax.CalculateInterest();
    }
}


