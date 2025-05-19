import java.util.Scanner;

public class OddNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1));
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}