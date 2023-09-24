package src.org.launchcode;

import static src.org.launchcode.Constance.*;
public class User extends Person {
    private final String nick;
    private final String password;

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
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
            int age = Integer.parseInt(tab[2]);
            String place = tab[3];
            String nick = tab[4];
            String pas = tab[5];

        return new User(id,name,age,place,nick,pas);
    }

    public String addUserCsv() {

        return getId() + SEPARATOR + getName() + SEPARATOR + getAge()+ SEPARATOR + getLocalization() + SEPARATOR + getNick() +SEPARATOR + getPassword();

    }

}
