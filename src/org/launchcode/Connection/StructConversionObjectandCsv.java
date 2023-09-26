package src.org.launchcode.Connection;

import src.org.launchcode.Object.Car;
import src.org.launchcode.Object.StructLabel;
import src.org.launchcode.Object.User;

import static src.org.launchcode.Interface.Constance.SEPARATOR;

public class StructConversionObjectandCsv {
    public static Car getCarFromCsv(String csvString) {
        String[] tab = csvString.split(SEPARATOR);

        int id = Integer.parseInt(tab[0]);
        String brand = tab[1];
        String model = tab[2];
        int year = Integer.parseInt(tab[3]);
        double price = Double.parseDouble(tab[4]);
        boolean isDeleted = Boolean.parseBoolean(tab[5]);

        return new Car(id,brand,model,year, price, isDeleted);
    }

    public static String getCarAsCsvString(Car car) {

        return car.getId() + SEPARATOR + car.getBrand() + SEPARATOR + car.getModel() + SEPARATOR + car.getYearProduction() + SEPARATOR + car.getPrice() + SEPARATOR + car.isDeleted();
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

    public static String addUserStringToCsv(User user) {

        return user.getId() + SEPARATOR + user.getName() + SEPARATOR + user.getAge()+ SEPARATOR + user.getLocalization() + SEPARATOR + user.getNick() +SEPARATOR + user.getPassword();

    }

    public static StructLabel getCarLabelFromCsv(String csvString){

        String[] tab = csvString.split(SEPARATOR);
        String id = tab[0];
        String brand = tab[1];
        String model = tab[2];
        String year = tab[3];
        String price = tab[4];
        String deleted = tab[5];

        return new StructLabel(id,brand,model,year,price,deleted);
    }

    public static String getCarLabelAsCsvString (StructLabel car){
        return car.getFirstColumnName() + SEPARATOR + car.getSecondColumnName() + SEPARATOR + car.getThirdColumnName() + SEPARATOR + car.getFourthColumnName() + SEPARATOR + car.getFifthColumnName() + SEPARATOR + car.getSixthColumnName();
    }

    public static StructLabel getUserLabelFromCsv(String csvString){

        String[] tab = csvString.split(SEPARATOR);
        String id = tab[0];
        String name = tab[1];
        String age = tab[2];
        String localization = tab[3];
        String user = tab[4];
        String password = tab[5];

        return new StructLabel(id,name,age, localization,user,password);
    }

    public static String getUserLabelAsCsvString (StructLabel user){
        return user.getFirstColumnName() + SEPARATOR + user.getSecondColumnName() + SEPARATOR + user.getThirdColumnName() + SEPARATOR + user.getFourthColumnName() + SEPARATOR + user.getFifthColumnName() + SEPARATOR + user.getSixthColumnName();
    }
}
