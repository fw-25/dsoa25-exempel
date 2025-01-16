import java.util.HashMap;

public class Bike extends Vehicle implements Shoppable {

    HashMap<String,BikeFeatures> features = new HashMap<>();

    public Bike(String name, double price) {
        super(name, "pedaled");
        this.setPrice(price);
    }

    public void setFeatures(BikeFeatures features) {

    }

    @Override
    public String soundWarning() {
        return "pling-pling";
    }

    @Override
    public int getStock() {
        return 0;
    }

    private class BikeFeatures {
        String suspension = "Hardtail";
        int gears = 1;
    }
}
