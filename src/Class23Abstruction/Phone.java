package Class23Abstruction;

public abstract class Phone{
    /*
    create a phone class and create abstact methods line displayPicture, unLockPhone, SendText
    child classes IPhone, Samsung Google and provide specific implementation
    lets write code to achieve runtime polymorphism.
     */

abstract void displayPicture();

abstract void unlocked();

abstract void sendText();
}

class IPhone extends Phone{
    @Override
    void displayPicture() {
        System.out.println("iPhoto to brows the picture");
    }

    @Override
    void unlocked() {
        System.out.println("Face ID is used to unlock");

    }

    @Override
    void sendText() {
        System.out.println("iMessages is used to sent text");

    }
}




class Samsung extends Phone{

    @Override
    void displayPicture() {
        System.out.println("Gallery app to browse the app");
    }

    @Override
    void unlocked() {
        System.out.println("Using fingerPrint sensor or camera");
    }

    @Override
    void sendText() {
        System.out.println("Messages app to send the messages");
    }
}

