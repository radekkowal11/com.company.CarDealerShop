package src.org.launchcode.Connection;

import src.org.launchcode.Object.Car;
import src.org.launchcode.Object.User;
import src.org.launchcode.Object.StructLabel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import static src.org.launchcode.Interface.Constance.*;
import static src.org.launchcode.Interface.Constance.cars;
import static src.org.launchcode.Interface.TransactionPanel.textAddCar;
import static src.org.launchcode.Interface.TransactionPanel.textAddUser;

public class ConnectionWithCsv {

    public static void addUser() {
        StructLabel structLabel;
        try (Scanner usersScanner = new Scanner(new FileInputStream(fileUsers))) {
            structLabel = StructConversionObjectandCsv.getUserLabelFromCsv(usersScanner.nextLine());
            while (usersScanner.hasNext()) {
                User newUser = StructConversionObjectandCsv.convertUserCsvToString(usersScanner.nextLine());
                newId = newUser.getId() + 1;
                users.add(newUser);
            }

            String[] tab = textAddUser();
            if(!isLetter(tab[0])){
                System.out.println("wrong sign in name");
                addUser();
            }
            int b = Integer.parseInt(tab[1]);

            User user = new User(newId, tab[0], b, tab[2], tab[3], tab[4]);

            users.add(user);

            writeUsers(users, structLabel);

        } catch (FileNotFoundException ex) {
            System.out.println("File with users data not found. Check filepath and try again");
        }

    }
    public static boolean isLetter(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

    private static void writeUsers(List<User> users, StructLabel structLabel) {
        try (PrintWriter usersPrintWrtiter = new PrintWriter(fileUsers)) {
            usersPrintWrtiter.println(StructConversionObjectandCsv.getUserLabelAsCsvString(structLabel));
            users.forEach(u -> usersPrintWrtiter.println(StructConversionObjectandCsv.addUserStringToCsv(u)));
        } catch (FileNotFoundException e) {
            System.out.println("File with users data not found. Check filepath and try again");
        }
    }

    public static void readCarsWithCsvToList() {
        takeId();
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            structLabel = StructConversionObjectandCsv.getCarLabelFromCsv(carsScanner.nextLine());
            while (carsScanner.hasNext()) {
                Car newCar = StructConversionObjectandCsv.getCarFromCsv(carsScanner.nextLine());
                cars.add(newCar);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File with cars data not found. Check filepath and try again");
        }
    }
    public static void readCarsWithCsvToMap(){
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            structLabel = StructConversionObjectandCsv.getCarLabelFromCsv(carsScanner.nextLine());
            while (carsScanner.hasNext()) {
                newCar = StructConversionObjectandCsv.getCarFromCsv(carsScanner.nextLine());
                mapCars.put(newCar.getIdMap(), newCar);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File with cars data not found. Check filepath and try again");
        }

    }
    public static void writeCarWithListToCsv(){
        try (PrintWriter carsPrintWrtiter = new PrintWriter(fileCars)) {
            carsPrintWrtiter.println(StructConversionObjectandCsv.getCarLabelAsCsvString(structLabel));
            cars.forEach(car -> carsPrintWrtiter.println(StructConversionObjectandCsv.getCarAsCsvString(car)));
        } catch (FileNotFoundException e) {
            System.out.println("File with cars data not found. Check filepath and try again");
        }
    }

    public static void writeCarWithMapToCsv(){
        try (PrintWriter carsPrintWrtiter = new PrintWriter(fileCars)) {
            carsPrintWrtiter.println(StructConversionObjectandCsv.getCarLabelAsCsvString(structLabel));
            mapCars.forEach((i, c) -> carsPrintWrtiter.println(StructConversionObjectandCsv.getCarAsCsvString(c)));
        } catch (FileNotFoundException e) {
            System.out.println("File with cars data not found. Check filepath and try again");
        }
    }
    public static void addCar() {
            cars.clear();
            readCarsWithCsvToList();

            String[] tab = textAddCar();

            int yearProduction = Integer.parseInt(tab[2]);
            double price = Double.parseDouble(tab[3]);

            cars.add(new Car(userId, tab[0], tab[1], yearProduction, price));

            writeCarWithListToCsv();

    }


    public static void deleteCar() {
        cars.clear();
        mapCars.clear();
        readCarsWithCsvToList();
        readCarsWithCsvToMap();

        System.out.println("Your cars");
        mapCars.forEach((key, value) -> {
            if (userId == value.getId())
                if(!value.isDeleted)
                    System.out.println(key + " --> " + value);

        });

        System.out.println("Write id cars to delete: ");
        int numbers = scanner.nextInt();

        mapCars.forEach((k, v) -> {
            if (numbers == k) {
                v.setDeleted(true);
            }

        });
        writeCarWithMapToCsv();
    }

    private static void takeId() {
        try (Scanner usersScanner = new Scanner(new FileInputStream(fileUsers))) {
            StructConversionObjectandCsv.getUserLabelFromCsv(usersScanner.nextLine());
            while (usersScanner.hasNext()) {
                User newUser = StructConversionObjectandCsv.convertUserCsvToString(usersScanner.nextLine());
                if (Login.equals(newUser.getNick())) {
                    userId = newUser.getId();
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File with users data not found. Check filepath and try again");
        }
    }

    public static void buyCar(int choice) {
            mapCars.clear();
            readCarsWithCsvToMap();

            mapCars.forEach((key,value) -> {
                if (choice == key) {
                    value.setId(newUserId);
                }

            });
            writeCarWithMapToCsv();
    }

}
