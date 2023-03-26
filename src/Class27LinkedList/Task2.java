package Class27LinkedList;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        //2)Create an arraylist of cars and retrieve all the values using 3 different ways.

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Toyota");

        System.out.println(cars);

      // here we used for each loop

        for (String car : cars) {
            System.out.println(car);
        }

        // we use a for loop here

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}