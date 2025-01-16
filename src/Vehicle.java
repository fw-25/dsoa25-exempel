abstract class Vehicle {

    private String name;
    private String type;
    private double price = 0.0;
    private double discount = 0.9;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String soundWarning() {
        return "default sound";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price * discount;
    }

    public void setPrice(double price) {
        if (price < 0) throw new RuntimeException("Bad Price!");
        this.price = price;
    }

    public double getGrossPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
