import java.util.Random;

public class BikeFactory {

    public static Bike createExpensiveBike(String name) {
        Random random = new Random();
        double price = random.nextDouble(800, 2000);
        return new Bike(name, price);
    }

    public static Bike createCheapBike(String name) {
        Random random = new Random();
        double price = random.nextDouble(200, 500);
        return new Bike(name, price);
    }
}
