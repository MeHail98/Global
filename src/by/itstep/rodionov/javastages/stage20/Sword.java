package by.itstep.rodionov.javastages.stage20;

public class Sword extends Ammunition {

    private int length;

    public Sword(int price, String material, String color, int weight, int length) {
        super(price, material, color, weight);
        this.length = length;
    }

    public Sword(int length) {
        this.length = length;
    }

    public Sword() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setPrice(int price){

    }

    @Override
    public String toString() {
        return "Sword{" +
                "length=" + length + ", "+
                   super.toString();
    }
}
