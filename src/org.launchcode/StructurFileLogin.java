package src.org.launchcode;

import javax.xml.namespace.QName;

import static src.org.launchcode.Config.SEPARATOR;

public class StructurFileLogin {
    private int id;
    private String nick;
    private String password;

    public int getId() {
        return id;
    }

    public StructurFileLogin(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String addStructureCsv() {
        // Dodawanie

        return getNick() +" "+ getPassword();

    }
}
