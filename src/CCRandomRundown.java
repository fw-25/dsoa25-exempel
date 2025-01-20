import java.util.Random;
import java.util.Scanner;

public class CCRandomRundown {

    public CCRandomRundown() {

        Random rnd = new Random();
        Scanner userInput = new Scanner(System.in);

        do {

            System.out.printf("Slumptal: %d\n", rnd.nextInt(20));
            System.out.print("tryck Enter för ett nytt, q (quit) för att avsluta:");

        } while (!userInput.nextLine().equalsIgnoreCase("q"));

    }

}
