package Class25Encapsulation;

public class Account {

    //below we create the field (variable)
   private double balance;
   private String accountNumber;
   private String type;
    private String accuntTitle;

    public void setAccountNumber(String accountNumber){
        if (accountNumber.length()!=16){
            System.out.println("Wrong account number");
        }else{
            this.accountNumber=accountNumber;
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(double balance){
        if(balance<0){
            System.out.println("Negative balance is not allowed, it is a current account");
        }else{
            this.balance=this.balance+balance;
        }

    }
    public String getAccuntTitle(){
        return accuntTitle;
    }

    public Account(double balance, String accountNumber, String type, String accuntTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accuntTitle = accuntTitle;
    }
}
class AccountTester{
    public static void main(String[] args) {
        Account account=new Account(-1000,"sndeeoij","fsjdlk","kfnjvnoeraev");
        System.out.println(account.getAccuntTitle());//we can see it but can't modify it
        account.setBalance(-2345);

    }


 }











 /*   //below is method

    void depositFunds(double balance){
        this.balance=this.balance+balance;
    }

    void withDraw(double balance){
        if(balance>this.balance){
            this.balance=this.balance-balance;
        }
    }*/
