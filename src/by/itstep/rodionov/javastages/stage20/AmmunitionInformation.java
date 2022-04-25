package by.itstep.rodionov.javastages.stage20;

public class AmmunitionInformation {

    private int price;
    private String material;
    private String color;


    public AmmunitionInformation(int price, String material, String color) {
        super();
        this.price = price;
        this.material = material;
        this.color = color;
    }

    public AmmunitionInformation(int price) {
        this.price = price;
    }

    public AmmunitionInformation() {
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

    @Override
    public String toString() {
        return "AmmunitionInformation{" +
                "price=" + price +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
