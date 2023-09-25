package src.org.launchcode.Object;

import static src.org.launchcode.Interface.Constance.*;
public class User {
    private int id;
    private String name;
    private int age;
    private String localization;
    private String nick;
    private String password;

    public User(int id, String name, int age, String localization, String nick, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.localization = localization;
        this.nick = nick;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocalization() {
        return localization;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public static User convertUserCsvToString(String csvString) {

        String[] tab = csvString.split(SEPARATOR);

            int id = Integer.parseInt(tab[0]);
            String name = tab[1];
            int age = Integer.parseInt(tab[2]);
            String place = tab[3];
            String nick = tab[4];
            String pas = tab[5];

        return new User(id,name,age,place,nick,pas);
    }

    public String addUserStringToCsv() {

        return getId() + SEPARATOR + getName() + SEPARATOR + getAge()+ SEPARATOR + getLocalization() + SEPARATOR + getNick() +SEPARATOR + getPassword();

    }

    @Override
    public String toString() {
        return "id: " + getId()+ ", name: " + name + ", age: " + age +
                ", localization: " + localization;
    }

}
