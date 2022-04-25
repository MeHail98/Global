package by.itstep.rodionov.javastages.stage20;

public class Helmet extends AmmunitionInformation {

    private String gender;
    private String imprisoned;

    public Helmet(int price, String material, String color, String gender, String imprisoned) {
        super(price, material, color);
        this.gender = gender;
        this.imprisoned = imprisoned;
    }

    public Helmet(String gender, String imprisoned) {
        this.gender = gender;
        this.imprisoned = imprisoned;
    }

    public Helmet(){
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImprisoned() {
        return imprisoned;
    }

    public void setImprisoned(String imprisoned) {
        this.imprisoned = imprisoned;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "gender='" + gender + '\'' +
                ", imprisoned='" + imprisoned + '\'' +
                "} " + super.toString();
    }

}
