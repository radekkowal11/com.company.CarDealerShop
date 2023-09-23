package src.org.launchcode;
public class StructFileLogin {
    private final String nick;
    private final String password;

    public StructFileLogin(String nick, String password) {
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
        return getNick() +" "+ getPassword();

    }
}
