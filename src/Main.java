import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Komstanter med static final
    static final String PROGRAM_VERSION = "1.0";
    static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        new CCRandomRundown();
         */

        BikeShop shop = new BikeShop();
        shop.addBike(BikeFactory.createExpensiveBike("Scott"));
        shop.addBike(new Bike("Nishiki", 500));
        shop.addBike(BikeFactory.createCheapBike("Insera"));

        System.out.println("Välkommen till BikeShop! Våra cyklar:");
        for (int i = 0; i < shop.getBikeCount(); i++) {
            System.out.printf("%d - %s %.2f € lagersaldo: %s\n",
                    i,
                    shop.getBike(i).getName(),
                    shop.getBike(i).getPrice(),
                    shop.getBike(i).getStock()
            );

        }


        String userInput;

        while (true) {

            System.out.print("Vilken cykel vill du köpa? (q för quit) ");

            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Tack, välkommen åter!");
                break;
            }

            if (!Utils.isInteger(userInput)) {
                System.out.println("Du måste ge ett heltal!");
                continue;
            }

            int bikeIndex = Integer.parseInt(userInput);
            if (bikeIndex >= shop.getBikeCount()) {
                System.out.println("Det finns ingen sådan cykel");
                continue;
            }

            System.out.printf("Grattis, du köpte nu en %s för %.2f\n",
                    shop.getBike(bikeIndex).getName(),
                    shop.getBike(bikeIndex).getPrice()
            );
            break;

        }

        System.exit(0);


    }
}



