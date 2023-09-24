package src.org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Constance {
    public static String fileLogin = "csv\\login.csv";
    public static String fileUsers = "csv\\users.csv";
    public static String fileCars = "csv\\cars.csv";

    public static String SEPARATOR = ",";

    public static int newId;
    public static String Login;
    public static int userId;
    public static Scanner scanner = new Scanner(System.in);
    public static List<Car> cars = new ArrayList<>();

}
