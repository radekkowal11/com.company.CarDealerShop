package src.org.launchcode;

public class Car {

    private int id;
    private String brand;
    private String model;
    private int yearProduction;
    private double price;

    public Car(String brand, String model, int yearProduction, double price) {
        this.brand = brand;
        this.model = model;
        this.yearProduction = yearProduction;
        this.price = price;
    }

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
        return "Car{" +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearProduction=" + yearProduction +
                ", price=" + price +
                '}';
    }
}
