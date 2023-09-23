package src.org.launchcode;
import static src.org.launchcode.Config.SEPARATOR;
public class Offer {

    public static Car fromCsvString(String csvString) {
        String[] tab = csvString.split(SEPARATOR);

        int id = Integer.parseInt(tab[0]);
        String brand = tab[1];
        String model = tab[2];
        int year = Integer.parseInt(tab[3]);
        double price = Double.parseDouble(tab[4]);

        return new Car(id,brand,model,year, price);
    }
    public static String addCarsCsv(Car car) {

        return car.getId() + SEPARATOR + car.getBrand() + SEPARATOR + car.getModel() + SEPARATOR + car.getYearProduction() + SEPARATOR + car.getPrice();
    }

}
