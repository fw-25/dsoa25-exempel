public class Shirt extends Clothing implements Shoppable {

    String brand;
    double price;

    public Shirt(String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.condition = 50;
    }

    @Override
    void mend() {
        this.condition = 90;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int getStock() {
        return 0;
    }
}
