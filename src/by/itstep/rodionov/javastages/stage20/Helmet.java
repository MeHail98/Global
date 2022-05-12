package by.itstep.rodionov.javastages.stage20;

public class Helmet extends Ammunition {

    private String gender;

    public Helmet(int price, String material, String color, int weight, String gender) {
        super(price, material, color,weight);
        this.gender = gender;
    }

    public Helmet(String gender) {
        this.gender = gender;
    }

    public Helmet(){
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "gender=" + gender + ", "+ super.toString();
    }

}
