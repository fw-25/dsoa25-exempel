public class Shirt extends Clothing {

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
}
