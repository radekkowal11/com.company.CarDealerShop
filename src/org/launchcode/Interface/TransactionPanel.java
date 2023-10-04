package src.org.launchcode.Interface;

import java.util.InputMismatchException;

import static src.org.launchcode.Interface.Constance.*;
public class TransactionPanel {
    public static String[] textAddUser(){
        String[] tab = new String[5];
        try {
            System.out.print("Add name: ");
            String a = scanner.next();
            System.out.println();
            System.out.print("Add age: ");
            int b = scanner.nextInt();
            System.out.println();
            System.out.print("Add adress: ");
            String c = scanner.next();
            System.out.println();
            System.out.print("Add nick: ");
            String d = scanner.next();
            System.out.println();
            System.out.print("Add password: ");
            String e = scanner.next();
            System.out.println();

            tab[0] = a;
            tab[1] = String.valueOf(b);
            tab[2] = c;
            tab[3] = d;
            tab[4] = e;
        }catch (InputMismatchException exception){
            System.out.println("Write wrong value. You must add integer");
        }

        return tab;

    }

    public static String[] textAddCar(){
        System.out.print("Add brand: ");
        String brand = scanner.next();
        System.out.println();
        System.out.println("Add model: ");
        String model = scanner.next();
        System.out.println();
        System.out.println("Add year of production: ");
        int yearProduction = scanner.nextInt();
        System.out.println();
        System.out.println("Add price: ");
        double price = scanner.nextDouble();

        String[] tab = new String[4];
        tab[0] = brand;
        tab[1] = model;
        tab[2] = String.valueOf(yearProduction);
        tab[3] = String.valueOf(price);

        return  tab;
    }

}
