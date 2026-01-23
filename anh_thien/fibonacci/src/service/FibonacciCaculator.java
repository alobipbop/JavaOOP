
package service;

import java.util.HashMap;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class FibonacciCaculator {

    /**
     * This function use recursion method to find Fibonacci sequence
     *
     * @param number the number of the sequences
     * @return
     */
    private HashMap<Integer, Long> cache = new HashMap<>();

    long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Nếu đã tính rồi thì lấy từ cache
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        // Nếu chưa thì tính và lưu vào cache
        long value = fibonacci(n - 1) + fibonacci(n - 2);
        cache.put(n, value);

        return value;
    }

    public void printFibonacci(int n) {
        System.out.println("The " + n + " sequence fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }
}
