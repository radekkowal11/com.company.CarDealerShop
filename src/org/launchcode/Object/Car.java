package src.org.launchcode.Object;

import java.util.Comparator;

import static src.org.launchcode.Interface.Constance.*;

public class Car implements Comparator<Car>,Comparable<Car> {
    private int id;
    private final String brand;
    private final String model;
    private final int yearProduction;
    private final double price;
    public boolean isDeleted = false;

    public Car(int id, String brand, String model, int yearProduction, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearProduction = yearProduction;
        this.price = price;
        //isDeleted = false;
    }

    public Car(int id, String brand, String model, int yearProduction, double price, boolean isDeleted) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearProduction = yearProduction;
        this.price = price;
        this.isDeleted = isDeleted;
    }

    public int getIdMap() {
             nextIdMap++;
        return nextIdMap;
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

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return
                "brand: " + brand + ", model: " + model  + ", yearProduction: " + yearProduction + ", price: " + price;
    }

    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car1.getPrice(), car2.getPrice());
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.yearProduction, car.yearProduction);
    }
}


