package src.org.launchcode.Connection;

import src.org.launchcode.Interface.SelectionPanel;
import src.org.launchcode.Object.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static src.org.launchcode.Interface.Constance.*;
import static src.org.launchcode.Interface.SelectionPanel.log;
import static src.org.launchcode.Connection.ConnectionWithCsv.*;

public class CheckPassword {
    public static void checkPassword(String a, String b) {
        try(Scanner LoginScanner = new Scanner(new FileInputStream(fileUsers))){
            StructConversionObjectandCsv.getCarLabelFromCsv(LoginScanner.nextLine());
            while (LoginScanner.hasNext()) {
                User newUser = StructConversionObjectandCsv.convertUserCsvToString(LoginScanner.nextLine());
                newId = newUser.getId() + 1;
                users.add(newUser);
            }
            for (User user : users){
                if (a.equals(user.getNick())){
                    if (b.equals(user.getPassword())){
                        Login = a;
                        newUserId = user.getId();
                        readCarsWithCsvToList();
                        readCarsWithCsvToMap();
                        SelectionPanel.Panel();
                    }else {
                        System.out.println("Login error. Try again");
                        log();
                    }
                }else {
                    System.out.println("Login error. Try again");
                    log();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File with users data not found. Check filepath and try again");
        }
    }
}
