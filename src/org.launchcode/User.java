package src.org.launchcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static src.org.launchcode.Config.*;

public class User extends Person {

    private String nick;
    private String password;

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public User() {

    }

    public User(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public User(String nick) {
        this.nick = nick;
    }

    public User(String name, int age, String localization, String nick, String password) {
        super(name, age, localization);
        this.nick = nick;
        this.password = password;

    }
    public User(int id,String name, int age, String localization, String nick, String password) {
        super(id,name, age, localization);
        this.nick = nick;
        this.password = password;

    }

    public static User fromCsvString(String csvString) {
        String[] tab = csvString.split(SEPARATOR);

            int id = Integer.parseInt(tab[0]);
            String name = tab[1];
            int wiek = Integer.parseInt(tab[2]);
            String place = tab[3];
            String nick = tab[4];
            String pas = tab[5];

        return new User(id,name,wiek,place,nick,pas);
    }

    public String addUserCsv() {
       // Dodawanie użytkownika

        return getId() + SEPARATOR + getName() + SEPARATOR + getAge()+ SEPARATOR + getLocalization() + SEPARATOR + getNick() +SEPARATOR + getPassword();

    }

}
