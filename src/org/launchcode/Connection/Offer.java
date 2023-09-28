package src.org.launchcode.Connection;

import src.org.launchcode.Object.Car;
import src.org.launchcode.Object.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import static src.org.launchcode.Interface.Constance.*;

public class Offer {
    public static void findCars() {

        for (Car car : cars) {
            if (!car.isDeleted)
             System.out.println(car);
        }
    }

    public static void findBrand(String brand) {

        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                if (!car.isDeleted)
                    System.out.println(car);
            }
        }
    }

    public static void sortByPrice() {

        cars.sort(newCar);
        for (Car car : cars) {
            if (!car.isDeleted)
                System.out.println(car);
        }
    }

    public static void sortByYearProduction() {

        Collections.sort(cars);

        for (Car car : cars) {
            if (!car.isDeleted)
                System.out.println(car);
        }
    }

    public static void MapCars() {

        mapCars.forEach((key, value) -> {
            if (key <= mapCars.size())
                if (!value.isDeleted)
                    System.out.println(key + " --> " + value);
        });
        nextIdMap = 0;
    }

    public static void getOwner(int n) {
        final int[] p = new int[1];
        mapCars.forEach((key, value) -> {
            if (n == key) {
                if (!value.isDeleted)
                 p[0] = value.getId();
            }
        });

        try (Scanner usersScanner = new Scanner(new FileInputStream(fileUsers))) {
            int plus = 0;
            structLabel = StructConversionObjectandCsv.getUserLabelFromCsv(usersScanner.nextLine());
            while (usersScanner.hasNext()) {
                plus++;
                User newUser = StructConversionObjectandCsv.convertUserCsvToString(usersScanner.nextLine());
                newId = newUser.getId() + plus;
                if (p[0] == newUser.getId()) {
                    System.out.println(newUser);
                    break;
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

