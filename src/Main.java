public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota");
        Car otherCar = new Car("Volvo");

        System.out.println("Hello " + car.getName());
        car.setName("Kia");
        System.out.println("New name: " + car.getName());

        System.out.println("Hello " + otherCar.getName());

    }
}



