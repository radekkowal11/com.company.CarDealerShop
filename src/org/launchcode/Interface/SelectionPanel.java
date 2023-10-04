package src.org.launchcode.Interface;

import src.org.launchcode.Connection.CheckPassword;

import static src.org.launchcode.Connection.ConnectionWithCsv.*;
import static src.org.launchcode.Connection.Offer.*;
import static src.org.launchcode.Interface.Constance.*;

public class SelectionPanel {

    public static void log() {
        System.out.println("Chose one option");
        System.out.println("1.Log in");
        System.out.println("2.Add user");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("LOGIN");
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
            System.out.println("////////WELCOME TO THE CAR DEALERSHIP/////////");
            System.out.println("Chose one option");
            System.out.println("1.Add car");
            System.out.println("2.Delete car");
            System.out.println("3.Search car");
            System.out.println("4.Log out");

            int number = scanner.nextInt();
            if (number == 0)
                break;

            switch (number) {
                case 1 -> addCar();
                case 2 -> deleteCar();
                case 3 -> {
                    System.out.println("Select search options");
                    System.out.println("1.Show all cars");
                    System.out.println("2.Select car brand");
                    System.out.println("3.Sort ascending by price");
                    System.out.println("4.Sort from oldest");
                    System.out.println("5.In the form of a map");
                    int n = scanner.nextInt();
                    switch (n) {
                        case 1:
                            findCars();
                            System.out.println("--> Next page.Press 2");
                            System.out.println("--> Previous page. Press 3");
                            System.out.println("--> Press 0 to back menu");
                            int number2 = scanner.nextInt();

                            while (number2!=0){
                                findCars(number2);

                                System.out.println("--> Next page. Press 2");
                                System.out.println("--> Previous page. Press 3");
                                System.out.println("--> Press 0 to back menu");
                                number2 = scanner.nextInt();

                            }

                            System.out.println("1.Back to home page");
                            int e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }

                        case 2:
                            System.out.println("Write car bran:");
                            String brand = scanner.next();
                            findBrand(brand);
                            System.out.println("1.Back to home page");
                            e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }
                        case 3:
                            sortByPrice();
                            System.out.println("1.Back to home page");
                            e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }
                        case 4:
                            sortByYearProduction();
                            System.out.println("1.Back to home page");
                            e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }
                        case 5:
                            MapCars();
                            System.out.println("3.Buy");
                            System.out.println("2.Show owner");
                            System.out.println("1.Back to home page");
                            e = scanner.nextInt();
                            if (e == 1) {
                                break;
                            }
                            if (e == 2) {
                                System.out.print("Write car id number: ");
                                n = scanner.nextInt();
                                getOwner(n);
                                System.out.println("1.Back to home page");
                                e = scanner.nextInt();
                                if (e == 1) {
                                    break;
                                }
                            }
                            if (e == 3){
                                System.out.print("Write car id number: ");
                                int choice = scanner.nextInt();
                                System.out.println();
                                buyCar(choice);
                                System.out.println("1.Back to home page");
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

