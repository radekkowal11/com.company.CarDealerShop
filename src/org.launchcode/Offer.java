package src.org.launchcode;

import java.util.LinkedList;
import java.util.List;

public class Offer {
    Car car;

    public static void addCar(Car car, List<Car> cars){
       cars.add(car);

    }
    public static void findCar(List<Car> cars){
        for (Car car : cars){
            System.out.println(car);
        }
    }


}
