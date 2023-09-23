package src.org.launchcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static src.org.launchcode.Config.fileLogin;
import static src.org.launchcode.SelectionPanel.Login;

public class CheckPassword {
    public static void checkPassword(String a, String b) {
        List<StructFileLogin> structFileLoginList = new ArrayList<>();

        try(Scanner LoginScanner = new Scanner(new FileInputStream(fileLogin))){
            while(LoginScanner.hasNext()) {
                structFileLoginList.add(new StructFileLogin(LoginScanner.next(), LoginScanner.next()));
            }
            for (StructFileLogin structure : structFileLoginList){
                if (a.equals(structure.getNick())){
                    if (b.equals(structure.getPassword())){
                        Login = a;
                        SelectionPanel.Panel();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
