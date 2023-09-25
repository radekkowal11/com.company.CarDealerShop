package src.org.launchcode.Connection;

import src.org.launchcode.Interface.SelectionPanel;
import src.org.launchcode.Object.StructLabel;
import src.org.launchcode.Object.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static src.org.launchcode.Interface.Constance.*;
import static src.org.launchcode.Interface.SelectionPanel.log;

public class CheckPassword {
    public static void checkPassword(String a, String b) {
        List<User> users = new ArrayList<>();
        StructLabel structLabel;
        try(Scanner LoginScanner = new Scanner(new FileInputStream(fileUsers))){
            structLabel = StructLabel.getCarLabelFromCsv(LoginScanner.nextLine());
            while (LoginScanner.hasNext()) {
                User newUser = User.convertUserCsvToString(LoginScanner.nextLine());
                newId = newUser.getId() + 1;
                users.add(newUser);
            }
            for (User user : users){
                if (a.equals(user.getNick())){
                    if (b.equals(user.getPassword())){
                        Login = a;
                        SelectionPanel.Panel();
                    }
                }else {
                    System.out.println("Błędne dane logowania, spróbuj jeszcze raz");
                    log();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
