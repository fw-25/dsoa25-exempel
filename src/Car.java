public class Car extends Vehicle {
    private int fuel = 0;

    // Överlagring, overload
    public Car(String name) {
        super(name, "motorized");
        super.setPrice(10000.0);
    }
    public Car(double price) {
        super("default-car", "motorized");
        super.setPrice(price);
    }
    public Car(String name, double price) {
        super(name, "motorized");
        super.setPrice(price);
    }
    public Car(String name, String type) {
        super(name, type);
        super.setPrice(1000.0);
    }

    @Override
    public String soundWarning() {
        return "tut-tut";
    }

    public void refuel() {
        this.fuel = 100;
    }

}
