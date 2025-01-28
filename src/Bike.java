import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;

public class Bike extends Vehicle implements Shoppable, Serializable {

    private int stock = 5;
    HashMap<String,String> features = new HashMap<>();
    Random random = new Random();
    DiscountCategory discountCat = DiscountCategory.NEW;

    public Bike(String name, double price) {
        super(name, "pedaled");
        this.setPrice(price);
    }
    public Bike(String name, double price, DiscountCategory discountCat) {
        super(name, "pedaled");
        this.setPrice(price);
        this.discountCat = discountCat;
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

    public DiscountCategory getDiscountCat() {
        return discountCat;
    }

    @Override
    public double getPrice() {
        double netPrice;
        switch (discountCat) {
            case DEMO:
                netPrice = getGrossPrice() * 0.9;
                break;
            case RETURNED:
                netPrice = getGrossPrice() * 0.8;
                break;
            default:
                netPrice = getGrossPrice();
        }
        return netPrice;
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
