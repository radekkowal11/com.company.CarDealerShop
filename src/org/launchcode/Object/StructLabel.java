package src.org.launchcode.Object;

public class StructLabel {
    String firstColumnName;
    String secondColumnName;
    String thirdColumnName;
    String fourthColumnName;
    String fifthColumnName;

    String sixthColumnName;
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

}
