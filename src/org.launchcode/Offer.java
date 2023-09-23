package src.org.launchcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static src.org.launchcode.Config.fileCars;
import static src.org.launchcode.SelectionPanel.*;

public class Offer {
    public static void findCars() {
        getCarsCsv();
        for (Car car : cars) {
            System.out.println(car);
        }
    }
    public static void findBrand(String brand) {
        getCarsCsv();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                System.out.println(car);
            }
        }
    }

    public static void sortByPrice(){
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            cars.clear();
            while (carsScanner.hasNext()) {
                Car newCar = Car.fromCsvString(carsScanner.nextLine());
                cars.add(newCar);
                cars.sort(newCar);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static void getCarsCsv() {
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            cars.clear();
            while (carsScanner.hasNext()) {
                Car newCar = Car.fromCsvString(carsScanner.nextLine());
                cars.add(newCar);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
