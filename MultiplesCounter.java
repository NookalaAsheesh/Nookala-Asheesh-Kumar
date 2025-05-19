import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Map to hold the count of multiples
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Initialize the map with 0 counts for 1 through 9
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count how many numbers are divisible by each number from 1 to 9
        for (int key : countMap.keySet()) {
            int count = 0;
            for (int num : numbers) {
                if (num % key == 0) {
                    count++;
                }
            }
            countMap.put(key, count);
        }

        // Output
        System.out.println("Output:");
        System.out.println(countMap);
    }
}