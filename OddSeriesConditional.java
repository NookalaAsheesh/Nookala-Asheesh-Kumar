import java.util.Scanner;

public class OddSeriesConditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        // If 'a' is even, reduce it by 1
        if (a % 2 == 0) {
            a -= 1;
        }

        System.out.print("Output: ");
        for (int i = 0; i < a; i++) {
            System.out.print(2 * i + 1);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}