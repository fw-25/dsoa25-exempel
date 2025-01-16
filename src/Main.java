import java.util.ArrayList;

public class Main {

    // Komstanter med static final
    static final String PROGRAM_VERSION = "1.0";
    static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {

        BikeShop shop = new BikeShop();
        shop.addBike(new Bike("Scott", 600));
        shop.addBike(new Bike("Nishiki", 500));
        shop.addBike(new Bike("Insera", 200));

        shop.getBike(0).addFeature("suspension", "hardtail");
        shop.getBike(0).addFeature("wheelsize", "29 inch");
        /* i JS ungefär:
            const features = { suspension: "hardtail", wheelsize: "29 inch" }
        */
        //System.out.println(shop.getBike(1).getFeature("suspension"));

        System.out.println("Välkommen till BikeShop! Våra cyklar:");
        for (int i = 0; i < shop.getBikeCount(); i++) {
            System.out.printf("%s %.2f € lagersaldo: %s\n",
                shop.getBike(i).getName(),
                shop.getBike(i).getPrice(),
                shop.getBike(i).getStock()
            );

            System.out.println(shop.getBike(i).getFeatures());
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



