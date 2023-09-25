package src.org.launchcode.Interface;

import static src.org.launchcode.Interface.Constance.*;
public class TransactionPanel {
    public static String[] textAddUser(){
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

        String[] tab = new String[5];

        tab[0] = a;
        tab[1] = String.valueOf(b);
        tab[2] = c;
        tab[3] = d;
        tab[4] = e;

        return tab;

    }

    public static String[] textAddCar(){
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

        String[] tab = new String[4];
        tab[0] = brand;
        tab[1] = model;
        tab[2] = String.valueOf(yearProduction);
        tab[3] = String.valueOf(price);

        return  tab;
    }

}
