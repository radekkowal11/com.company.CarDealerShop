package src.org.launchcode.Interface;

import src.org.launchcode.Object.Car;

import java.util.*;

public class Constance {
    public static String fileUsers = "csv\\users.csv";
    public static String fileCars = "csv\\cars.csv";

    public static String SEPARATOR = ",";

    public static int newId;
    public static String Login;
    public static int userId;
    public static Scanner scanner = new Scanner(System.in);
    public static List<Car> cars = new ArrayList<>();
    public static Map<Integer,Car> deleteCar = new HashMap<>();
    public static int nextIdMap = 0;

}
