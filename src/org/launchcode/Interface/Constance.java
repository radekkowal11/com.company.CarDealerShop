package src.org.launchcode.Interface;

import src.org.launchcode.Object.Car;
import src.org.launchcode.Object.StructLabel;
import src.org.launchcode.Object.User;

import java.util.*;

public class Constance {
    public static String fileUsers = "csv\\users.csv";
    public static String fileCars = "csv\\cars.csv";

    public static String SEPARATOR = ",";

    public static int newId;
    public static String Login ;
    public static int userId;
    public static Scanner scanner = new Scanner(System.in);
    public static List<User> users = new ArrayList<>();

    public static Car newCar;
    public static List<Car> cars = new ArrayList<>();
    public static Map<Integer,Car> mapCars = new HashMap<>();
    public static int nextIdMap = 0;
    public static int newUserId;
    public static StructLabel structLabel;


}
