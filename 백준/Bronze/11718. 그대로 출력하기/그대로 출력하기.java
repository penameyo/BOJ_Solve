import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //줄이 끝날 때 까지 스캔하기
        while (sc.hasNextLine()){
            String str=sc.nextLine();
            // 문자열의 길이 출력
            System.out.println(str);
        }
        // 스캐너 닫기
        sc.close();
    }
}