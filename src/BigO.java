import java.util.Arrays;

public class BigO {

    //int[] data = { 1, 3, 5, 7, 9, 8, 6, 4, 2 };
    int[] data = new int[10000];
    long ops;

    public BigO() {

        //System.out.println(Arrays.toString(data));
        System.out.printf("Datamängdens storlek: %d\n", data.length);

        /**
         * O(n)
         */
        ops = 0;
        for (int i = 0; i < data.length; i++) {
            ops++;
        }
        System.out.printf("O(n): %d operationer\n", ops);

        /**
         * O(n^2)
         */
        ops = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                ops++;
            }
        }
        System.out.printf("O(n^2): %d operationer\n", ops);

        /**
         * O(log n)
         */
        ops = 0;
        int len = data.length;
        while (len > 0) {
            len = len / 2;
            ops++;
        }
        System.out.printf("O(log n): %d operationer\n", ops);

        /**
         * O(n log n) ( n * log(n) )
         */
        ops = 0;
        len = data.length;
        while (len > 0) {
            len = len / 2;
            for (int i = 0; i < data.length; i++) {
                ops++;
            }
        }
        System.out.printf("O(n log n): %d operationer\n", ops);


    }

}
