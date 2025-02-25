public class Recursy {

    static long ops;

    static void hello() {
        hello();
    }

    /**
     * Recursive loop
     *
     * @param i
     * @param max
     */
    static void loop(int i, int max) {
        if (i > max) return;
        System.out.print(i + " ");
        loop(i+1, max);
    }

    /**
     * fibonacci
     *
     */
    static int fib(int n) {
        ops++;
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    static long[] fibCache = new long[1000];
    static long fastFib(int n) {
        ops++;
        if (n <= 1) return n;
        // om värdet redan finns uträknat, returnera det
        if (fibCache[n] != 0) return fibCache[n];
        long ret = fastFib(n-1) + fastFib(n-2);
        fibCache[n] = ret; // skriv in värdet i cache
        return ret;
    }



}
