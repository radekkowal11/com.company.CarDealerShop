package src.org.launchcode.Connection;

import src.org.launchcode.Object.Car;
import src.org.launchcode.Object.User;
import src.org.launchcode.Object.StructLabel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import static src.org.launchcode.Interface.Constance.*;
import static src.org.launchcode.Interface.TransactionPanel.textAddCar;
import static src.org.launchcode.Interface.TransactionPanel.textAddUser;

public class ConnectionWithCsv {

    public static void addUser() {
        StructLabel structLabel;
        try (Scanner usersScanner = new Scanner(new FileInputStream(fileUsers))) {
            List<User> users = new ArrayList<>();
            structLabel = StructLabel.getUserLabelFromCsv(usersScanner.nextLine());
            while (usersScanner.hasNext()) {
                User newUser = User.convertUserCsvToString(usersScanner.nextLine());
                newId = newUser.getId() + 1;
                users.add(newUser);
            }

                String[] tab = textAddUser();
                int b = Integer.parseInt(tab[1]);

            User user = new User(newId, tab[0], b, tab[2], tab[3], tab[4]);

            users.add(user);

            writeUsers(users,structLabel);

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

    }

    private static void writeUsers(List<User> users, StructLabel structLabel) {
        try (PrintWriter usersPrintWrtiter = new PrintWriter(fileUsers)) {
            usersPrintWrtiter.println(StructLabel.getUserLabelAsCsvString(structLabel));
            users.forEach(u -> usersPrintWrtiter.println(u.addUserStringToCsv()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addCars() {
        takeId();
        StructLabel structLabel;
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            structLabel = StructLabel.getCarLabelFromCsv(carsScanner.nextLine());
            while (carsScanner.hasNext()) {
                Car newCar = Car.getCarFromCsv(carsScanner.nextLine());
                cars.add(newCar);
            }

            String[] tab = textAddCar();

            int yearProduction = Integer.parseInt(tab[2]);
            double price = Double.parseDouble(tab[3]);

            cars.add(new Car(userId, tab[0], tab[1], yearProduction, price));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter carsPrintWrtiter = new PrintWriter(fileCars)) {
            carsPrintWrtiter.println(StructLabel.getCarLabelAsCsvString(structLabel));
            cars.forEach(car -> carsPrintWrtiter.println(Car.getCarAsCsvString(car)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void deleteCar() {

        takeId();
        StructLabel structLabel;

        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            Car newCar ;
            structLabel = StructLabel.getCarLabelFromCsv(carsScanner.nextLine());
            while (carsScanner.hasNext()) {
                    newCar = Car.getCarFromCsv(carsScanner.nextLine());
                    deleteCar.put(newCar.getIdMap(), newCar);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
            ;
        System.out.println("Twoje samochody");
        deleteCar.forEach((key,value) ->{

            if (userId == value.getId())
                System.out.println(key + " --> " + value);

        });

        System.out.println("Podaj numer samochodu, który chcesz usunąć: ");
        int numbers = scanner.nextInt();

        deleteCar.forEach((k,v) ->{
            System.out.println(v.getIdMap());
            if (numbers == k){
                v.setDeleted(true);
            }

        });


           try (PrintWriter carsPrintWrtiter = new PrintWriter(fileCars)) {
            carsPrintWrtiter.println(StructLabel.getCarLabelAsCsvString(structLabel));
            deleteCar.forEach((i,c) -> carsPrintWrtiter.println(Car.getCarAsCsvString(c)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void takeId() {
        StructLabel structLabel;
        try (Scanner usersScanner = new Scanner(new FileInputStream(fileUsers))) {
            structLabel = StructLabel.getUserLabelFromCsv(usersScanner.nextLine());
            while (usersScanner.hasNext()) {
                User newUser = User.convertUserCsvToString(usersScanner.nextLine());
                if (Login.equals(newUser.getNick())) {
                    userId = newUser.getId();
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
