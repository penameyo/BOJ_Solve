import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int I = Integer.parseInt(st.nextToken());

		if (I >= 90) {
			System.out.println("A");
		} else if (I >= 80) {
			System.out.println("B");
		} else if (I >= 70) {
			System.out.println("C");
		} else if (I >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
}