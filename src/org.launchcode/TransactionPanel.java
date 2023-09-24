package src.org.launchcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static src.org.launchcode.Constance.*;


public class TransactionPanel {
    public static void addUser() {
        try (Scanner usersScanner = new Scanner(new FileInputStream(fileUsers))) {
            List<StructFileLogin> structFileLogin = new ArrayList<>();
            List<User> users = new ArrayList<>();

            while (usersScanner.hasNext()) {
                User newUser = User.fromCsvString(usersScanner.nextLine());
                newId = newUser.getId() + 1;
                users.add(newUser);
                structFileLogin.add(new StructFileLogin(newUser.getNick(), newUser.getPassword()));
            }

            System.out.print("Podaj imie: ");
            String a = scanner.next();
            System.out.println();
            System.out.print("Podaj wiek: ");
            int b = scanner.nextInt();
            System.out.println();
            System.out.print("Podaj miejscowosc: ");
            String c = scanner.next();
            System.out.println();
            System.out.print("Podaj nick: ");
            String d = scanner.next();
            System.out.println();
            System.out.print("Podaj hasło: ");
            String e = scanner.next();
            System.out.println();

            User user = new User(newId, a, b, c, d, e);

            users.add(user);
            structFileLogin.add(new StructFileLogin(d, e));

            writeUsers(users, structFileLogin);

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

    }

    private static void writeUsers(List<User> users, List<StructFileLogin> structFileLoginList) {
        try (PrintWriter usersPrintWrtiter = new PrintWriter(fileUsers)) {
            users.forEach(u -> usersPrintWrtiter.println(u.addUserCsv()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (PrintWriter loginPrintWrtiter = new PrintWriter(fileLogin)) {
            structFileLoginList.forEach(s -> loginPrintWrtiter.println(s.addStructureCsv()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addCars() {
        takeId();
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            while (carsScanner.hasNext()) {
                Car newCar = Car.getCarFromCsv(carsScanner.nextLine());
                cars.add(newCar);
            }

            System.out.print("Podaj marke: ");
            String brand = scanner.next();
            System.out.println();
            System.out.println("Podaj model: ");
            String model = scanner.next();
            System.out.println();
            System.out.println("Podaj rok produkcji: ");
            int yearProduction = scanner.nextInt();
            System.out.println();
            System.out.println("Podaj oczekiwaną cene: ");
            double price = scanner.nextDouble();
            cars.add(new Car(userId, brand, model, yearProduction, price));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter carsPrintWrtiter = new PrintWriter(fileCars)) {
            cars.forEach(car -> carsPrintWrtiter.println(Car.getCarAsCsvString(car)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteCar() {
        List<Car> deleteCar = new ArrayList<>();
        takeId();
        try (Scanner carsScanner = new Scanner(new FileInputStream(fileCars))) {
            while (carsScanner.hasNext()) {
                Car newCar = Car.getCarFromCsv(carsScanner.nextLine());
                if (userId != newCar.getId()) {
                    deleteCar.add(newCar);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (PrintWriter carsPrintWrtiter = new PrintWriter(fileCars)) {
            deleteCar.forEach(car -> carsPrintWrtiter.println(Car.getCarAsCsvString(car)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void takeId() {
        try (Scanner usersScanner = new Scanner(new FileInputStream(fileUsers))) {
            while (usersScanner.hasNext()) {
                User newUser = User.fromCsvString(usersScanner.nextLine());
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
