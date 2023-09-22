package src.org.launchcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static src.org.launchcode.Config.fileUsers;
import static src.org.launchcode.Person.nextId;

public class SelectionPanel {

    public static int newId;
    public static Scanner scanner = new Scanner(System.in);

    public static void log() {
        System.out.println("Wybierze jedną z opcji");
        System.out.println("1.Logowanie");
        System.out.println("2.Dodaj użytkownika");
        int liczba = scanner.nextInt();
        switch (liczba) {
            case 1:
                System.out.println("LOGOWANIE");
                System.out.print("User: ");
                String username = scanner.next();
                System.out.println();
                System.out.print("Password: ");
                String password = scanner.next();
                System.out.println();

                CheckPassword.checkPasword(username, password);
                break;

            case 2:
                addUser();
                log();
                break;
        }

    }
    public static void addUser() {
        try(Scanner usersScanner = new Scanner(new FileInputStream(fileUsers))) {

            List<User> users = new ArrayList<>();

            while (usersScanner.hasNext()){
               User newUser = User.fromCsvString(usersScanner.nextLine());
               newId = newUser.getId() + 1;
                users.add(newUser);
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

            User user = new User(newId,a, b, c, d, e);

            users.add(user);

            writeUsers(users);

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

    }

    private static void writeUsers(List<User> users) {
        try(PrintWriter usersPrintWrtiter = new PrintWriter(fileUsers)){
            users.forEach(u ->{
                usersPrintWrtiter.println(u.addUserCsv());
            });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Panel() {


        List<Car> cars = new LinkedList<>();

        while (true) {

            System.out.println("////////WITAJ W KOMISIE/////////");
            System.out.println("Wybierz jedną z opcji");
            System.out.println("1. Dodawanie samochodu");
            System.out.println("2.Usuwanie samochodu");
            System.out.println("3.Wyszukaj samochód");

            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    User user;
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
                    Offer.addCar((new Car(brand, model, yearProduction, price)), cars);
                    break;
                case 2:
                    System.out.println("Usuwanie samochodu");
                    break;
                case 3:
                    Offer.findCar(cars);
                    break;
            }
        }

    }
}
