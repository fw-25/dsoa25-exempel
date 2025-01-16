import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Komstanter med static final
    static final String PROGRAM_VERSION = "1.0";
    static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {

        CCTestingOverload calculator = new CCTestingOverload();
        System.out.println(calculator.multiply(7, 6));

        Scanner scanner = new Scanner(System.in);

        BikeShop shop = new BikeShop();
        shop.addBike(new Bike("Scott", 600));
        shop.addBike(new Bike("Nishiki", 500));
        shop.addBike(new Bike("Insera", 200));

        System.out.println("Välkommen till BikeShop! Våra cyklar:");
        for (int i = 0; i < shop.getBikeCount(); i++) {
            System.out.printf("%d - %s %.2f € lagersaldo: %s\n",
                    i,
                    shop.getBike(i).getName(),
                    shop.getBike(i).getPrice(),
                    shop.getBike(i).getStock()
            );
        }

        System.out.print("Vilken cykel vill du köpa? (q för quit) ");
        String userInput;

        while (true) {

            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Tack, välkommen åter!");
                System.exit(0);
            }

            try {
                int bikeIndex = Integer.parseInt(userInput);
                System.out.printf("Grattis, du äger nu en %s\n",
                        shop.getBike(bikeIndex).getName()
                );
                break;
            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Det finns ingen sådan cykel!");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }


        System.exit(0);

        // Konkatenering:
        Shirt shirt = new Shirt("Gant", 99.9999);
        Shirt shirt2 = new Shirt("Dressman", 30);

        System.out.println(shirt.getBrand() + " kostar " + shirt.getPrice() + " lagersaldo: " + shirt.getStock() + " st");
        System.out.printf("%s kostar %.2f € lagersaldo: %d st\n",
                shirt.getBrand(),
                shirt.getPrice(),
                shirt.getStock());

        // String.format() returnerar en string
        String shirtInfo = String.format("%s kostar %.2f € lagersaldo: %d st",
                shirt2.getBrand(),
                shirt2.getPrice(),
                shirt2.getStock());
        System.out.println(shirtInfo);

        // default-konstruktor
        Foo foo = new Foo();

    }
}



