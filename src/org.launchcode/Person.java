package src.org.launchcode;

public class Person {
    private final int id;
    private final String name;
    private final int age;
    private final String localization;

    public Person(int id, String name, int age, String localization) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.localization = localization;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocalization() {
        return localization;
    }

    @Override
    public String toString() {
        return "id: " + getId()+ ", name: " + name + ", age: " + age +
                ", localization: " + localization;
    }
}
