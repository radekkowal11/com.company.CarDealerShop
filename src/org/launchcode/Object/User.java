package src.org.launchcode.Object;

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

    @Override
    public String toString() {
        return "id: " + getId()+ ", name: " + name + ", age: " + age +
                ", localization: " + localization;
    }

}
