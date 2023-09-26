package src.org.launchcode.Connection;

import src.org.launchcode.Object.Car;
import src.org.launchcode.Object.User;
import src.org.launchcode.Object.StructLabel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import static src.org.launchcode.Interface.Constance.*;

public class Offer {
    static Map<Integer, Car> carsMap = new HashMap<>();
    static StructLabel structLabel;

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

    public static void sortByPrice() {
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            cars.clear();
            structLabel = StructConversionObjectandCsv.getCarLabelFromCsv(carsScanner.nextLine());
            while (carsScanner.hasNext()) {
                Car newCar = StructConversionObjectandCsv.getCarFromCsv(carsScanner.nextLine());
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

    public static void sortByYearProduction() {
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            cars.clear();
            structLabel = StructConversionObjectandCsv.getCarLabelFromCsv(carsScanner.nextLine());
            while (carsScanner.hasNext()) {
                Car newCar = StructConversionObjectandCsv.getCarFromCsv(carsScanner.nextLine());
                cars.add(newCar);
                Collections.sort(cars);

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
            structLabel = StructConversionObjectandCsv.getCarLabelFromCsv(carsScanner.nextLine());
            while (carsScanner.hasNext()) {
                Car newCar = StructConversionObjectandCsv.getCarFromCsv(carsScanner.nextLine());
                cars.add(newCar);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void MapCars() {
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            structLabel = StructConversionObjectandCsv.getCarLabelFromCsv(carsScanner.nextLine());
            while (carsScanner.hasNext()) {
                Car newCar = StructConversionObjectandCsv.getCarFromCsv(carsScanner.nextLine());
                carsMap.put(newCar.getIdMap(), newCar);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        carsMap.forEach((key, value) -> {
            if (key <= carsMap.size())
                System.out.println(key + " --> " + value);
        });
    }

    public static void getOwner(int n) {
        final int[] p = new int[1];
        carsMap.forEach((key, value) -> {
            if (n == key) {
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

