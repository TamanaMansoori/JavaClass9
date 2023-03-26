package Class23Abstruction;

public class PhoneTester {

    public static void main(String[] args) {


        Phone[] phones = {new IPhone(), new Samsung()};

        for (Phone po : phones) {
            po.unlocked();
            po.displayPicture();
            po.sendText();
        }
    }
}