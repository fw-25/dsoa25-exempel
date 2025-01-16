import java.util.ArrayList;

public class BikeShop {

    private ArrayList<Bike> bikes = new ArrayList<>();

    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public Bike getBike(int index) {
        return bikes.get(index);
    }

    public int getBikeCount() {
        return bikes.size();
    }

}
