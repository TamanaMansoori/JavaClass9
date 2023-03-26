package Class24Interface;

public class MovAbleTester {
    public static void main(String[] args) {
        //belwo we do the polymor

        washAble [] washAbles={new SmartWatch(), new Inverter(),new Phone()};

            for(washAble w:washAbles){
                w.wash();
        }

    }
}
