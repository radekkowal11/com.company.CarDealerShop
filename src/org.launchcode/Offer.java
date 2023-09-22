package src.org.launchcode;

import java.util.LinkedList;
import java.util.List;

import static src.org.launchcode.Config.SEPARATOR;
import static src.org.launchcode.SelectionPanel.userId;

public class Offer {
    public Car car;

    public static void addCar(Car car, List<Car> cars) {
        cars.add(car);

    }

    public static Car fromCsvString(String csvString) {
        String[] tab = csvString.split(SEPARATOR);

        int id = Integer.parseInt(tab[0]);
        String brand = tab[1];
        String model = tab[2];
        int year = Integer.parseInt(tab[3]);
        double price = Double.parseDouble(tab[4]);

        return new Car(id,brand,model,year, price);
    }
    public static String addCarsCsv(Car car) {

        return car.getId() + SEPARATOR + car.getBrand() + SEPARATOR + car.getModel() + SEPARATOR + car.getYearProduction() + SEPARATOR + car.getPrice();
    }


    public static void findCar(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }


}
