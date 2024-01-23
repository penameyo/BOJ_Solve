import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 문자열 입력 받기
        String input = scanner.nextLine();

        // 문자열의 길이 출력
        int length = input.length();
        System.out.println(length);

        // 스캐너 닫기
        scanner.close();
    }
}