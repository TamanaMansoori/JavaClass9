package GroupProject2;

public abstract class Marks {


    abstract void getPercentage();


}

class A extends Marks{

    A(String math, String physics, String biology){
        System.out.println();

    }
    @Override
    void getPercentage() {

    }
}

class B extends Marks{

    B (String english, String geography, String art, String music){
        System.out.println();
    }
    @Override
    void getPercentage() {

    }


    public static void main(String[] args) {

    }
}
