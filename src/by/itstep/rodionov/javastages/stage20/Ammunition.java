package by.itstep.rodionov.javastages.stage20;

public class Ammunition {

    private int price;
    private String material;
    private String color;
    private int weight;

    public Ammunition(int price, String material, String color, int weight) {
        this.price = price;
        this.material = material;
        this.color = color;
        this.weight = weight;
    }

    public Ammunition(int price) {
        this.price = price;
    }

    public Ammunition() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "price=" + price +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
