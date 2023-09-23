package src.org.launchcode;

import java.util.Comparator;

public class Car implements Comparator<Car> {
    private final int id;
    private final String brand;
    private final String model;
    private final int yearProduction;
    private final double price;
    public Car(int id, String brand, String model, int yearProduction, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearProduction = yearProduction;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "brand =" + brand + ", model=" + model  + ", yearProduction=" + yearProduction + ", price=" + price;
    }

    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car1.getPrice(), car2.getPrice());
    }
}
