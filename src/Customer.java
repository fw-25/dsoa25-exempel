import java.io.Serializable;

public class Customer implements Serializable {
    private double funds;
    private Bike currentBike = null;

    public Customer(double funds) {
        this.funds = funds;
    }

    public double getFunds() {
        return funds;
    }

    public Bike getCurrentBike() {
        return currentBike;
    }

    public boolean buyBike(Bike bike) {
        if (bike.getPrice() > funds) return false;
        funds -= bike.getPrice(); // Samma som: funds = funds - bike.getPrice()
        this.currentBike = bike;
        return true;
    }
}
