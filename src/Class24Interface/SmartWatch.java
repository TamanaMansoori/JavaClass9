package Class24Interface;


interface washAble{//this is how we create the interface
   // abstract void wash(); //this is how we create the Abstruct method

    void wash();
    //but in Interface this abstract is by default

}



public class SmartWatch implements washAble{

    public void wash(){
        System.out.println("I am IP65 you can wash me");
    }
}

class Phone implements washAble{

    public void wash(){
        System.out.println("I am IP65 you can wash me");
    }

}

class Inverter implements washAble{
    public void wash(){
        System.out.println("I am IP65 you can wash me");
    }
}