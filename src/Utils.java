import java.util.Scanner;

public class Utils {

    /**
     * Code Challenge User Input
     */

    public static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            }
        }
    }
    // Overload
    public static int getIntInput() {
        return getIntInput("Ge ett heltal: ");
    }



    // testa om en teckensträng är ett heltal
    public static boolean isInteger(String str) {
        return str.matches("-?\\d+");
    }


    public static String[] arrayReverse(String[] inputArr) {
        String[] reversed = new String[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            reversed[i] = inputArr[inputArr.length-1-i];
        }

        return reversed;
    }



}
