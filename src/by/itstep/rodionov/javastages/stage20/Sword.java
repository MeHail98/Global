package by.itstep.rodionov.javastages.stage20;

public class Sword extends AmmunitionInformation {

    private int length;
    private int weight;

    public Sword(int price, String material, String color, int length, int weight) {
        super(price, material, color);
        this.length = length;
        this.weight = weight;
    }

    public Sword(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public Sword() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "length=" + length +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
