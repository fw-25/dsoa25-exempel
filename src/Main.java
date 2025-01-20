import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Komstanter med static final
    static final String PROGRAM_VERSION = "1.0";
    static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ny feature!!");

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


    }
}



