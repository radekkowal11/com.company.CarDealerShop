package src.org.launchcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static src.org.launchcode.Config.fileLogin;

public class CheckPassword {

    public static void checkPasword(String a, String b) {

        Person person = new Person();

        List<StructurFileLogin> structurFileLoginList = new ArrayList<>();

        try(Scanner LoginScanner = new Scanner(new FileInputStream(fileLogin))){
            while(LoginScanner.hasNext()) {
                structurFileLoginList.add(new StructurFileLogin(LoginScanner.next(), LoginScanner.next()));
            }
            for (StructurFileLogin structure : structurFileLoginList){
                if (a.equals(structure.getName())){
                    if (b.equals(structure.getPassword())){
                        SelectionPanel.Panel();
                    }
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
