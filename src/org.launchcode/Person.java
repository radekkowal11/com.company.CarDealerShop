package src.org.launchcode;

public class Person {
    private int id;
    public static int nextId = 0;

    private String name;
    private int age;
    private String localization;

    public Person() {
    }

    public Person(String name, int age, String localization) {
        id = nextId;
        this.name = name;
        this.age = age;
        this.localization = localization;
        nextId++;

    }

    public Person(int id, String name, int age, String localization) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.localization = localization;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Person{" +
                "id=" + getId()+
                ", name='" + name + '\'' +
                ", age=" + age +
                ", localization='" + localization + '\'' +
                '}';
    }
}
