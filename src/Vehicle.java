abstract class Vehicle {

    private String name;
    private String type;
    private Double price = 0.0;
    private Double discount = 0.9;

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

    public Double getPrice() {
        return price * discount;
    }

    public void setPrice(Double price) {
        if (price < 0) throw new RuntimeException("Bad Price!");
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
