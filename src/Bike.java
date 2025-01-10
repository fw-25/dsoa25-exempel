public class Bike extends Vehicle {

    public Bike(String name) {
        super(name, "pedaled");
    }

    @Override
    public String soundWarning() {
        return "pling-pling";
    }
}
