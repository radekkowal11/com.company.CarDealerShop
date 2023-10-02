package src.org.launchcode.Interface;

import src.org.launchcode.Connection.CheckPassword;

import static src.org.launchcode.Connection.ConnectionWithCsv.*;
import static src.org.launchcode.Connection.Offer.*;
import static src.org.launchcode.Interface.Constance.*;

public class SelectionPanel {

    public static void log() {
        System.out.println("Wybierz jedną z opcji");
        System.out.println("1.Logowanie");
        System.out.println("2.Dodaj użytkownika");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("LOGOWANIE");
                System.out.print("User: ");
                String username = scanner.next();
                System.out.println();
                System.out.print("Password: ");
                String password = scanner.next();
                System.out.println();
                CheckPassword.checkPassword(username, password);
            }
            case 2 -> {
                addUser();
                log();
            }
        }
    }

    public static void Panel() {

        while (true) {
            System.out.println("////////WITAJ W KOMISIE/////////");
            System.out.println("Wybierz jedną z opcji");
            System.out.println("1. Dodawanie samochodu");
            System.out.println("2.Usuwanie samochodu");
            System.out.println("3.Wyszukaj samochód");
            System.out.println("4.Wyloguj się");

            int number = scanner.nextInt();
            if (number == 0)
                break;

            switch (number) {
                case 1 -> addCar();
                case 2 -> deleteCar();
                case 3 -> {
                    System.out.println("Wybierz opcje wyszukiwania");
                    System.out.println("1.Pokaż wszystkie samochody");
                    System.out.println("2.Wybierz marke samochodu");
                    System.out.println("3.Posortu rosnąco po cenie");
                    System.out.println("4.Posortu od najstarszych");
                    System.out.println("5.W formie mapy");
                    int n = scanner.nextInt();
                    switch (n) {
                        case 1:
                            findCars();
                            System.out.println("Natępna strona wciśnij 2");
                            System.out.println("Poprzednia strona wciśnij 3");
                            System.out.println("Wciśnij 0 aby wrócić do poprzedniego menu");
                            int number2 = scanner.nextInt();

                            while (number2!=0){
                                findCars(number2);

                                System.out.println("Natępna strona wciśnij 2");
                                System.out.println("Poprzednia strona wciśnij 3");
                                System.out.println("Wciśnij 0 aby wrócić do poprzedniego menu");
                                number2 = scanner.nextInt();

                            }
                            System.out.println("1.Wyjscie do strony głównej");
                            int e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }

                        case 2:
                            System.out.println("Podaj marke samochodu");
                            String brand = scanner.next();
                            findBrand(brand);
                            System.out.println("1.Wyjscie do strony głównej");
                            e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }
                        case 3:
                            sortByPrice();
                            System.out.println("1.Wyjście do strony głównej");
                            e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }
                        case 4:
                            sortByYearProduction();
                            System.out.println("1.Wyjście do strony głównej");
                            e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }
                        case 5:
                            MapCars();
                            System.out.println("3.Kup");
                            System.out.println("2.Pokaz właścicela");
                            System.out.println("1.Wyjście do strony głównej");
                            e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }
                            if (e == 2) {
                                System.out.print("Podaj numer id samochodu: ");
                                n = scanner.nextInt();
                                getOwner(n);
                                System.out.println("1.Wyjście do strony głównej");
                                e = scanner.nextInt();
                                if (e == 1) {
                                    break;
                                }
                            }
                            if (e == 3){
                                System.out.print("Podaj numer id samochodu: ");
                                int choice = scanner.nextInt();
                                System.out.println();
                                buyCar(choice);
                                System.out.println("1.Wyjście do strony głównej");
                                e = scanner.nextInt();
                                if (e == 1) {
                                    break;
                                }
                            }
                    }

                }
                case 4 -> log();
            }
        }
    }

}

