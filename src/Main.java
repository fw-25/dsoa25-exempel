public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota");
        Bike bike = new Bike("Scott");

        car.setName("VW");

        //car.setPrice(-1000.0);

        System.out.printf("%s kostar %.2f\n", car.getName(), car.getPrice());
        System.out.printf("%s is %s\n", car.getName(), car.getType());
        System.out.println(bike.getName() + " is " + bike.getType());

    }
}



