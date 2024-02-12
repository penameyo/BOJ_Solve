import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        for (long i = N; i>=1;i--){
            System.out.println(i);
        }
    }
}