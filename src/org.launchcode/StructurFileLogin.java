package src.org.launchcode;

import javax.xml.namespace.QName;

public class StructurFileLogin {
    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public StructurFileLogin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
