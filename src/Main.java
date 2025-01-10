public class Main {
    public static void main(String[] args) {


        Clothing shirt = new Shirt("Gant", 100);

        //Vehicle vehicle = new Vehicle("fordon", "foo");

        // Upcasting
        Vehicle car = new Car("Toyota", 5000);
        Vehicle bike = new Bike("Scott");

        Car car2 = new Car("Fiat");
        car2.refuel();

        Car car3 = new Car(20000.0);

        Car car4 = new Car("Tesla", "electric");

        Vehicle todaysVehicle;
        todaysVehicle = car;

        todaysVehicle = bike;

        System.out.println("i dag åker jag " + todaysVehicle.getName());

        //car.setPrice(-1000.0);

        System.out.printf("%s kostar %.2f\n", car.getName(), car.getPrice());
        System.out.printf("%s is %s\n", car.getName(), car.getType());
        System.out.println(car.soundWarning());

        System.out.printf("%s kostar %.2f\n", car2.getName(), car2.getPrice());


        System.out.println(bike.getName() + " is " + bike.getType());
        System.out.println(bike.soundWarning());
    }
}



