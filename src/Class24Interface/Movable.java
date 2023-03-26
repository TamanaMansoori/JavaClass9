package Class24Interface;

public interface Movable {//only this class can have public modifier
    void move();//only those class that can move have this behavio and it is method
}

interface OwnAble{
    void own();//this is another method and
    //NOTE: since we have 2 method here there for the Multipel inherantance is possible here
}
abstract class Car implements Movable, OwnAble{

    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {

    }
}


abstract class Dog implements Movable, OwnAble{
    @Override
    public void move() {

    }

    @Override
    public void own() {

    }
}