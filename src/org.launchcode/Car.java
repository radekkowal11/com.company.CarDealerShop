package src.org.launchcode;

public class Car {
    private String brand;
    private String model;
    private int yearProduction;
    private double price;

    Person person ;

    public Car() {

    }

    public Car(String brand, String model, int yearProduction, double price) {
        person.getId();
        this.brand = brand;
        this.model = model;
        this.yearProduction = yearProduction;
        this.price = price;
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
                "id='" + person.getId() + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearProduction=" + yearProduction +
                ", price=" + price +
                '}';
    }
}
