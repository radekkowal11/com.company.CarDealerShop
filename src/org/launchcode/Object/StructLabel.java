package src.org.launchcode.Object;

import static src.org.launchcode.Interface.Constance.SEPARATOR;

public class StructLabel {
    String firstColumnName;
    String secondColumnName;
    String thirdColumnName;
    String fourthColumnName;
    String fifthColumnName;

    String sixthColumnName;

    public StructLabel(String id_user, String brand, String model, String yearProduction, String price) {
        this.firstColumnName = id_user;
        this.secondColumnName = brand;
        this.thirdColumnName = model;
        this.fourthColumnName = yearProduction;
        this.fifthColumnName = price;
    }

    public StructLabel(String firstColumnName, String secondColumnName, String thirdColumnName, String fourthColumnName, String fifthColumnName, String sixthColumnName) {
        this.firstColumnName = firstColumnName;
        this.secondColumnName = secondColumnName;
        this.thirdColumnName = thirdColumnName;
        this.fourthColumnName = fourthColumnName;
        this.fifthColumnName = fifthColumnName;
        this.sixthColumnName = sixthColumnName;
    }

    public String getFirstColumnName() {
        return firstColumnName;
    }

    public String getSecondColumnName() {
        return secondColumnName;
    }

    public String getThirdColumnName() {
        return thirdColumnName;
    }

    public String getFourthColumnName() {
        return fourthColumnName;
    }

    public String getFifthColumnName() {
        return fifthColumnName;
    }

    public String getSixthColumnName() {
        return sixthColumnName;
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
