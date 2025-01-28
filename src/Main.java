import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Komstanter med static final
    static final String PROGRAM_VERSION = "1.0";
    static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //FileUtils.writeTextFile("Hello file! åäö", "hello.txt");
        //System.out.println(FileUtils.readTextFile("hello.txt"));
        // System.exit(0);

        Customer customer;
        Object loadedObject = FileUtils.loadObject("customer.save");
        if (loadedObject != null) {
            customer = (Customer) loadedObject;
        } else {
            customer = new Customer(1500);
        }


        BikeShop shop = new BikeShop();
        shop.addBike(BikeFactory.createExpensiveBike("Scott"));
        shop.addBike(new Bike("Nishiki", 500));
        shop.addBike(BikeFactory.createCheapBike("Insera"));

        String userInput;

        while (true) {

            System.out.printf("Välkommen till Cykelbutiken! Du har %.2f € och %s\n(Enter = fortsätt, q = quit)\n",
                    customer.getFunds(),
                    (customer.getCurrentBike() == null) ? "ingen cykel" : customer.getCurrentBike().getName()
            );

            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Tack, välkommen åter!");
                break;
            }

            for (int i = 0; i < shop.getBikeCount(); i++) {
                System.out.printf("%d - %s %.2f € lagersaldo: %s\n",
                        i,
                        shop.getBike(i).getName(),
                        shop.getBike(i).getPrice(),
                        shop.getBike(i).getStock()
                );
            }


            // Code Challenge
            int bikeIndex = Utils.getIntInput("Välj cykel att köpa: ");
            if (bikeIndex >= shop.getBikeCount()) {
                System.out.println("Det finns ingen sådan cykel!");
                continue;
            }

            if (!customer.buyBike(shop.getBike(bikeIndex))) {
                System.out.println("Du har inte råd med den cykeln!");
                continue;
            }



            System.out.printf("Grattis, du köpte nu en %s för %.2f\n",
                    shop.getBike(bikeIndex).getName(),
                    shop.getBike(bikeIndex).getPrice()
            );

            break;

        }

        FileUtils.saveObject(customer, "customer.save");

        System.exit(0);


    }
}



