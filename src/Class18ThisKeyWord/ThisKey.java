package Class18ThisKeyWord;

public class ThisKey {

    int a;
    int b;



    ThisKey(int a, int b){
        this.a =a;
        this.b=b;

    }
    public void sum (int a, int b){
        System.out.println("This give the sum of local variable "+(a+b));
        System.out.println("This give the sum of instance variable "+(this.a+this.b));//here we use (this) to find instance variable
    }

    //here we create method one method inside another method
    void hello(){
        System.out.println("hello batch 15");
    }

    void howAreYou(){
        System.out.println("How are you batch 15");
    }

    void greetings(){
      this.hello();//referce to current class and instance method
      this.howAreYou();//referce to current class and instance method
    }

    public static void main(String[] args) {
        ThisKey obj =new ThisKey(10,20);

        obj.sum(100,200);

        //-----------------------------


        obj.greetings();//line 22 and 26 will be executed
    }
}

