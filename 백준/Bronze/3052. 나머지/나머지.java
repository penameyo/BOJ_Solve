import java.util.HashSet;
import java.util.Scanner;

public class Main {
    //HashSet 개념 학습
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(scanner.nextInt() % 42);
        }
        System.out.println(h.size());
    }
}