import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = N; k >i-1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}