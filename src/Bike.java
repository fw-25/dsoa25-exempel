import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;

public class Bike extends Vehicle implements Shoppable, Serializable {

    private int stock = 0;
    HashMap<String,String> features = new HashMap<>();
    Random random = new Random();

    public Bike(String name, double price) {
        super(name, "pedaled");
        this.setPrice(price);

        // random-tal mellan 1 och 20:
        stock = random.nextInt(1, 20);
        // samma sak på traditionellt sätt:
        stock = random.nextInt(19) + 1;

    }


    public void addFeature(String key, String value) {
        features.put(key, value);
    }

    public String getFeature(String key) {
        return features.get(key);
    }

    public String getFeatures() {
        String ret = "";
        for (String key: features.keySet()) {
            ret += String.format(" - %s: %s\n",
                    key,
                    features.get(key)
            );
        }
        return ret;
    }

    @Override
    public String soundWarning() {
        return "pling-pling";
    }

    @Override
    public int getStock() {
        return stock;
    }

}
